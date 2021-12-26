# Selenium Java Web Automation

## Check out [Rokomari.com](https://www.rokomari.com/book) website automation.

## Important  note to run this project 
```
step 01) first create a .env file root of the project 
step 02) add information as like as below inside .env file

EMAIL_ADDRESS="ENTER_YOUR_EMAIL_ADDRESS"
EMAIL_PASSWORD="ENTER_YOUR_EMAIL_PASSWORD"

```
<<<<<<< HEAD
**Automation Step:**
1.      Sign Up using Google              2. Select লেখক from the menu
3.      Select হুমায়ুন আহমেদ                 4. Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
5.      Scroll Down and go to Next Page   6. Add to cart any two books
7.      Click Cart Icon      8. Go to the Shipping page      9. Provide your Shipping Information
=======
**Automation Steps:**
1.      Sign Up using Google                                             2. Select লেখক from the menu        3. Select হুমায়ুন আহমেদ            
4.      Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র     5. Scroll Down and go to Next Page   6. Add to cart any two books
7.      Click Cart Icon                                                  8. Go to the Shipping page           9. Provide your Shipping Information
>>>>>>> 598a916539b3e9cdaebec0aaf1c3dce2bd6b6e4a


<h1 align="center">
  <a href="https://docs.google.com/spreadsheets/d/1q_RnSs-LeAj5PcEE6dC_HJYKcGzQHskX/edit?usp=sharing&ouid=111806113776334653691&rtpof=true&sd=true"><u>Rokomari Test Case Link</u></a> 
</h1>

<h1 align="center">
  <a href="https://drive.google.com/drive/folders/1dH5ByL-9DyGZgJd3R0NOsu_-3Ce2lEdG?usp=sharing"><u>Rokomari Load Test Report Link</u></a> 
</h1>
 



This project using the following languages and frameworks:

* [Java 11](https://openjdk.java.net/projects/jdk/11/) as the programming language
* [TestNG](https://testng.org/doc/) as the UnitTest framework to support the test creation
* [Selenium WebDriver](https://www.selenium.dev/) as the web browser automation framework using the Java binding
* [.env file added](https://github.com/cdimascio/dotenv-java) Storing configuration in the environment

## Test architecture

We know that any automation project starting with a good test architecture.
This project can be your initial test architecture for a faster start.
You will see the following items in this architecture:

* [Page Objects pattern](#page-objects-pattern)
* [Execution types](#execution-types)
* [BaseTest](#basetest)
* [Configuration files](#configuration-files)
* [Profiles executors on pom.xml](#profiles-executors-on-pomxml)
* [Pipeline as a code](#pipeline-as-a-code)


Do you have any other items to add to this test architecture? Please do a pull request or open an issue to discuss.

### Page Objects pattern
I will not explain the Page Object pattern because you can find a lot of good explanations and examples on the internet.
Instead, I will explain what exactly about page objects I'm using in this project.

#### AbstractPageObject
This class has a protected constructor to remove the necessity to init the elements using the Page Factory.
Also, it sets the timeout from the `timeout` property value located on `general.properties` file.

All the Page Object classes should extend the `AbstractPageObject`.
It also tries to remove the `driver` object from the Page Object class as much as possible.



