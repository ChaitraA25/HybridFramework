package com.demowebshop.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_EndToEnd 
{
	@FindBy(linkText = "Log in")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(id = "RememberMe")
	private WebElement chk_box;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[1]/a")
	private WebElement books_tab;
	
	@FindBy(xpath ="//select[@id='products-orderby']")
	private WebElement Sort_by;
	
	@FindBy(xpath ="//select[@id='products-pagesize']")
	private WebElement page_size;
	
	@FindBy(xpath ="//select[@id='products-viewmode']")
	private WebElement viewmode;
	
	@FindBy(xpath ="//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")
	private WebElement computing_int;
	
	@FindBy(xpath ="//a[text()='Fiction']/../following-sibling::div[3]/div[2]/input")
	private WebElement fiction;
	
	@FindBy(xpath ="//a[text()='Health Book']/../following-sibling::div[3]/div[2]/input")
	private WebElement Healthbook;
	
	@FindBy(xpath ="//a[text()='Fiction']")
	private WebElement fictionbook;
	
	@FindBy(xpath ="//span[@title='Close']")
	private WebElement close;
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement cart_link;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[1]/td[6]/span[2]")
	private WebElement cprice;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[2]/td[6]/span[2]")
	private WebElement fprice;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[3]/td[6]/span[2]")
	private WebElement hprice;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[1]/td[1]/input")
	private WebElement comp_cbox;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[2]/td[1]/input")
	private WebElement fic_cbox;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']/../following-sibling::div/div/form/table/tbody/tr[3]/td[1]/input")
	private WebElement health_cbox;
	
	@FindBy(xpath ="//input[@value='Update shopping cart']")
	private WebElement Update_cart_btn;
	
	public POM_EndToEnd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement login_link()
	{
		return login_link;
	}
	public WebElement email()
	{
		return email;
	}

	public WebElement Login_btn() 
	{
		return login_btn;
	}

	
	public WebElement Pass() 
	{
		return pass;
	}

	public WebElement Chk_box() 
	{
		return chk_box;
	}

	public WebElement Books_tab() 
	{
		return books_tab;
	}

	public WebElement Sort_by() 
	{
		return Sort_by;
	}

	public WebElement Page_size() 
	{
		return page_size;
	}

	public WebElement Viewmode()
	{
		return viewmode;
	}

	public WebElement Computing_int() 
	{
		return computing_int;
	}

	public WebElement Fiction()
	{
		return fiction;
	}

	public WebElement Healthbook() 
	{
		return Healthbook;
	}

	public WebElement Fictionbook() 
	{
		return fictionbook;
	}

	public WebElement Close()
	{
		return close;
	}

	public WebElement Cart_link() 
	{
		return cart_link;
	}

	public WebElement Cprice() 
	{
		return cprice;
	}

	public WebElement Fprice() 
	{
		return fprice;
	}

	public WebElement Hprice() 
	{
		return hprice;
	}

	public WebElement Comp_cbox() 
	{
		return comp_cbox;
	}

	public WebElement Fic_cbox() 
	{
		return fic_cbox;
	}

	public WebElement Health_cbox() 
	{
		return health_cbox;
	}

	public WebElement Update_cart_btn()
	{
		return Update_cart_btn;
	}
	
	
	
	
	
}
