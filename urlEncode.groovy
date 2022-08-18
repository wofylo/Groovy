import java.net.URLEncoder;
def AppPath = "RTX_Deployment"
def Envname = "DEV"
def Product = "RTX"
 def message = "<b>Deploy [${Envname}] package</b>"
 println message
def ServerListFile = "ServerList_${Product}.csv"
println ServerListFile

import java.net.URLEncoder;
String url = "29th Apartment";   
String encodedUrl = URLEncoder.encode(message, "UTF-8");
print encodedUrl