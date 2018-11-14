/**
 * 
 */
package com.secureRestOauth;

import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author G521980
 *
 *Create Rest Client here............
 *
 */
public class REST_CreateSession {

	public static void main(String[] args) {
		//CONFIG PARAMETERS:
				//BEGIN------------CONFIG PARAMETERS BELOW TO YOUR ENVIRONMENT---------------------------------------
				String baseRestURL = "https://env-73627.customer.cloud.microstrategy.com/MicroStrategyLibrary";
				String cubeName = "MyCube";
				String username = "steve"; 
				String password = "";
				String projectID = "B7CA92F04B9FAE8D941C3E9B7E0CD754"; 
				String updatePolicy = "add";
				//END------------CONFIG PARAMETERS BELOW TO YOUR ENVIRONMENT---------------------------------------
				
				//Create HTTPClient - Used to make Request to API
				HttpClient httpClient = null;
				BasicCookieStore httpCookieStore = new BasicCookieStore();
				//HttpClientBuilder builder = HttpClientBuilder.create().setDefaultCookieSpecRegistry(httpCookieStore);
				//httpClient = builder.build();
				
				//Create Session using /api/auth/login
				String authToken = createAuthToken(baseRestURL, httpClient, username, password);
				System.out.println("Auth Token: " + authToken);
				
				if(authToken == null){
					System.out.println("Error: Unable to generate authToken - check to see if server is running");
					return;
				}
			}
				
			//Creates an AuthToken
			public static String createAuthToken(String baseRestURL, HttpClient httpClient, String username, String password){
				String APIPath = "/api/auth/login";
				String completeRestURL = baseRestURL + APIPath;
				System.out.println("REST API URL: " + completeRestURL);
			    
				// Define the server endpoint to send the HTTP request to
			    URL serverUrl;
				try {
					serverUrl = new URL(completeRestURL);
				
					HttpPost httpRequest = new HttpPost(completeRestURL);
					httpRequest.setHeader("Content-Type", "application/json");
					httpRequest.setHeader("Accept", "application/json");
					StringEntity body =new StringEntity("{\"username\": \""+username+"\",\"password\": \""+password+"\",\"loginMode\": 1,\"applicationType\": 35}");
					httpRequest.setEntity(body);
					 
					HttpResponse response = httpClient.execute(httpRequest);
					
					Header[] headers = (Header[]) response.getAllHeaders();
					for (int i = 0; i < headers.length; i++){
						Header header = headers[i];
						//System.out.println(header.getName() + " : " + header.getValue());
						if (header.getName().equalsIgnoreCase("X-MSTR-AuthToken")){
							return header.getValue();
						}
					}
					
					return null;
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
	}
	

