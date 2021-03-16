
public class StringAssignment2 {

	public static void main(String[] args) {
		String url1="https://www.cognizant.com/admin/policy/indes.html";
		String url2="https://www.cognizant.com/service.jsp";
		String url3="https://www.cognizant.com/customer/products/local/showProducts.asp";
		
		String command1=getCommand(url1);
		String command2=getCommand(url2);
		String command3=getCommand(url3);
		
		System.out.println("Command 1:"+command1);
		System.out.println("Command 2:"+command2);
		System.out.println("Command 3:"+command3);
		
		
		

	}

	private static String getCommand(String url) {
		int startAddress = url.lastIndexOf("/")+1;
		int EndAddress = url.lastIndexOf(".");
		
		
		return url.substring(startAddress, EndAddress);
	}

}
 