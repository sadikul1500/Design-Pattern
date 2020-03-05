void renderBanner() {
  // Render banner only if we're in fullscreen mode 
  // and a change is requested either in frame or 
  // target, or experiment is active.
	changeFrame = frame.isChanged
	changeTarget = target.isChanged
	runState = experiment.isRunning()
	frameSize = frame.getSize()
	screenSize  = screen.getSize()
	
  if (((changeFrame || changeTarget) || 
        runState ) &&
         (frameSize == screenSize))  {
    // print banner
  }
}