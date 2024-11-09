$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CreateAccount.feature");
formatter.feature({
  "name": "",
  "description": "  To validating Create New Account Function of Facebook Application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    To passing the values using datatable for facebook Create New Account function",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Facebook through Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStep.toOpenFacebookThroughChrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookStep.userHaveToClickCreateNewAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the first name",
  "rows": [
    {
      "cells": [
        "GK",
        "Ela",
        "GKE",
        "GKS"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.userHaveToPassTheFirstName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user have to pass the last name",
  "rows": [
    {
      "cells": [
        "no1",
        "GK"
      ]
    },
    {
      "cells": [
        "no2",
        "MSDVJ"
      ]
    },
    {
      "cells": [
        "no3",
        "GKE"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.toUserHaveToPassTheLastName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user have to pass the mobile number",
  "rows": [
    {
      "cells": [
        "mob1",
        "mob2",
        "mob3",
        "mob4"
      ]
    },
    {
      "cells": [
        "8253910526",
        "7124639764",
        "9876542342",
        "8932485523"
      ]
    },
    {
      "cells": [
        "1234987652",
        "9010080100",
        "8010030111",
        "9001090100"
      ]
    },
    {
      "cells": [
        "6363773736",
        "9875430954",
        "7010070100",
        "8989598985"
      ]
    },
    {
      "cells": [
        "8010080100",
        "9876541234",
        "7878784537",
        "9090900909"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.toUserHaveToPassTheMobileNumber(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user have to enter the password",
  "rows": [
    {
      "cells": [
        "8010080100",
        "9876541234",
        "7878784537",
        "9090900909"
      ]
    },
    {
      "cells": [
        "6363773736",
        "9875430954",
        "7010070100",
        "8989598985"
      ]
    },
    {
      "cells": [
        "8010080100",
        "9876541234",
        "7878784537",
        "9090900909"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.toUserHaveToEnterThePassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter birthday date",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.userHaveToEnterBirthdayDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter birthday month",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.userHaveToEnterBirthdayMonth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter birthday year",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.userHaveToEnterBirthdayYear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the gender  option",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.userHaveToClickTheGenderOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStep.clickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStep.closeTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Login.feature");
formatter.feature({
  "name": "",
  "description": "  To validating the Login Function of Facebook",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "    To passing the values using Example tag for login function",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To Open Facebook through Chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "User have to pass the username \"\u003cusername\u003e\" data",
  "keyword": "When "
});
formatter.step({
  "name": "User have to pass the password \"\u003cpassword dataa\u003e\" data",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password dataa"
      ]
    },
    {
      "cells": [
        "Gk",
        "123@gk"
      ]
    },
    {
      "cells": [
        "gke",
        "@gk!123"
      ]
    },
    {
      "cells": [
        "@ela",
        "gke0912"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    To passing the values using Example tag for login function",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Facebook through Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStep.toOpenFacebookThroughChrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the username \"Gk\" data",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassTheUsernameData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the password \"123@gk\" data",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassThePasswordData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.toClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLogStep.toCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To passing the values using Example tag for login function",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Facebook through Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStep.toOpenFacebookThroughChrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the username \"gke\" data",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassTheUsernameData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the password \"@gk!123\" data",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassThePasswordData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.toClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLogStep.toCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To passing the values using Example tag for login function",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Facebook through Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStep.toOpenFacebookThroughChrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the username \"@ela\" data",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassTheUsernameData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to pass the password \"gke0912\" data",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.userHaveToPassThePasswordData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogStep.toClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLogStep.toCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});