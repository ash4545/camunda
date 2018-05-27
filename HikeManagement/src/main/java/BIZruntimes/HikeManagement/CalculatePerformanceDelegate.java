package BIZruntimes.HikeManagement;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.awt.Desktop;
import java.net.URI;
public class CalculatePerformanceDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("HIKE-REQUESTS");
  static boolean b;
  public void execute(DelegateExecution execution) throws Exception {
	  boolean b;
    LOGGER.info("Processing request by '" + execution.getVariable("Employee Id") + "'...");
    LOGGER.info("Processing request by '" + execution.getVariable("Employee Name") + "'...");
    Desktop d=Desktop.getDesktop();
    if(Integer.parseUnsignedInt((String) execution.getVariable("WorkingYear"))>24)
    {
    	//b=true;
    	//Desktop d=Desktop.getDesktop();

    	 // Browse a URL, say google.com
    	 d.browse(new URI("Accept.html"));

    }
    else
    {
    	//b=false;
    	 d.browse(new URI("Reject.html"));
    }
    }
  }

