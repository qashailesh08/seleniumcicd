package heruko;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;
@Getter
public class HerukoSignInOr {

	public HerukoSignInOr(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	
	@FindBy(xpath = "//span[text()='Create account']")
	private WebElement createAccountBT;

	@FindBy(xpath = "//input[@name='emailAddress']")
	private WebElement emailTB;
	@FindBy(xpath = "//input[@name='accountName']")
	private WebElement accountNameTB;
	
	@FindBy(xpath = "//span[text()='Verify email address']")
	private WebElement verifyEmailTB;
}
