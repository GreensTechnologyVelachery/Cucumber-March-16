$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/01_Fb.feature");
formatter.feature({
  "name": "To validate the login functionality of fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogin.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid username in email field",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogin.to_pass_the_invalid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the ivalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.to_pass_the_ivalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate login with positive and negative combination",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "name": "To launch the application url",
  "keyword": "When "
});
formatter.step({
  "name": "To pass the positive or negative data \"\u003cusername\u003e\" to email field",
  "keyword": "And "
});
formatter.step({
  "name": "To pass the positive or \"\u003cpassword\u003e\" negative data to password field",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java@123"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "sel@123"
      ]
    },
    {
      "cells": [
        "python@gmail.com",
        "py@123"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login with positive and negative combination",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.to_launch_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or negative data \"java@gmail.com\" to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or \"java@123\" negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with positive and negative combination",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.to_launch_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or negative data \"selenium@gmail.com\" to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or \"sel@123\" negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with positive and negative combination",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.to_launch_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or negative data \"python@gmail.com\" to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or \"py@123\" negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with positive and negative combination",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.to_launch_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or negative data \"sql@gmail.com\" to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the positive or \"sql@123\" negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_positive_or_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/02_Amazon.feature");
formatter.feature({
  "name": "To validate the signin functionality of amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate signin with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Scenario4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the amazon url",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTask.userHasToLaunchTheAmazonUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the invalid username in email field",
  "rows": [
    {
      "cells": [
        "emailone",
        "java@gmail.com"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "sql@gmail.com"
      ]
    },
    {
      "cells": [
        "emailthree",
        "py@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTask.userHasToPassTheInvalidUsernameInEmailField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the continue button",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTask.userHasToClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the invalid password in password field",
  "rows": [
    {
      "cells": [
        "passwordone",
        "passwordtwo",
        "passwordthree"
      ]
    },
    {
      "cells": [
        "7654345",
        "2345432",
        "Python@123"
      ]
    },
    {
      "cells": [
        "cucumber@123",
        "testng@123",
        "763456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTask.userHasToPassTheInvalidPasswordInPasswordField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTask.userHasToClickTheSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});