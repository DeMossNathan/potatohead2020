public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor;
	private int eyeNumber;
  
	// add one instance variable
	
	private String earColor;
	
  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
    		eyeNumber = 2;
		eyeColor = "unknown";
		
		noseColor = "unknown";
    
    		// initialize your instance variable
    
	}
  
	public String getNoseColor()
	{
		return noseColor;	
	}
	
	public void setNoseColor(String color)
	{
		noseColor = color;
	}
	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// Add an accessor method and a mutator method for your instance variable

	/**
    		String getEyeColor()
    		accessor method for eyeColor
    		@return a string that describes the eye color
	*/
	public String getEyeColor()
	{
		return eyeColor;
	}

	
	/**
    		String toString()
    		gives the internal state of the Potatohead
    		@return output string
	*/
	public String toString()
	{
		String output;
		output =  "Number Of Eyes: " + eyeNumber;
		output += "\nEye Color: " + eyeColor;
    
    		// Add your instance variable to the toString() method

		return output;
	}
}
