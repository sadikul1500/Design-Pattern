void renderBanner() {
	platform = platform.toUpperCase().indexOf("MAC")
	browser = browser.toUpperCase().indexOf("IE") 
	flag =  wasInitialized()
  
  if ((platform > -1) &&
       (browser> -1) &&
        flag && resize > 0 )
  {
    // do something
  }
}