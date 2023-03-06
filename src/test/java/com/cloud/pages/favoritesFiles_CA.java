package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class favoritesFiles_CA {

    public favoritesFiles_CA() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//span[.='Files']")
public WebElement files;

 @FindBy(xpath = "//a[@class='action action-menu permanent']")
 public WebElement favorites;

 @FindBy(xpath="//span[.='Add to favorites']")
 public WebElement addToFavorites;

}
