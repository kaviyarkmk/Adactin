$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinProject.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter \"\u003cusername\u003e\" username",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;1"
    },
    {
      "cells": [
        "Prabhuvenkat",
        "prabhu9619"
      ],
      "line": 16,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2"
    },
    {
      "cells": [
        "anuamu04",
        "9003881833"
      ],
      "line": 17,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;3"
    },
    {
      "cells": [
        "Mahamilky",
        "hari.9500"
      ],
      "line": 18,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 219922,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 169681958,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 62555,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter \"Prabhuvenkat\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter \"prabhu9619\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 6576250097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prabhuvenkat",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_username(String)"
});
formatter.result({
  "duration": 2801763871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabhu9619",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 212698192,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 8587917198,
  "status": "passed"
});
formatter.after({
  "duration": 289319,
  "status": "passed"
});
formatter.before({
  "duration": 140261,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 108007,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 98721,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter \"anuamu04\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter \"9003881833\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 791343972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anuamu04",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_username(String)"
});
formatter.result({
  "duration": 174152238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9003881833",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 152011967,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 7265186217,
  "status": "passed"
});
formatter.after({
  "duration": 173005,
  "status": "passed"
});
formatter.before({
  "duration": 132442,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 159810,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 77217,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter \"Mahamilky\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter \"hari.9500\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 765085786,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahamilky",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_username(String)"
});
formatter.result({
  "duration": 169112117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hari.9500",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 109468322,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 7168443554,
  "status": "passed"
});
formatter.after({
  "duration": 51804,
  "status": "passed"
});
formatter.before({
  "duration": 73307,
  "status": "passed"
});
formatter.before({
  "duration": 28834,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 55714,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 44962,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Successfully clicked ConfirmationPage into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfully-clicked-confirmationpage-into-the-adactin-application-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user select location",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select hotels",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select roomno",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select checkin date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user select checkout date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user select adultroom",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user select childroom",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_location()"
});
formatter.result({
  "duration": 310161222,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_hotels()"
});
formatter.result({
  "duration": 184782284,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_roomtype()"
});
formatter.result({
  "duration": 188086978,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_roomno()"
});
formatter.result({
  "duration": 168631710,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_checkin_date()"
});
formatter.result({
  "duration": 5548347874,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_checkout_date()"
});
formatter.result({
  "duration": 5442697396,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_adultroom()"
});
formatter.result({
  "duration": 276851853,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_select_childroom()"
});
formatter.result({
  "duration": 253309946,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_click_submit_button()"
});
formatter.result({
  "duration": 8038196034,
  "status": "passed"
});
formatter.after({
  "duration": 129998,
  "status": "passed"
});
formatter.before({
  "duration": 129021,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 139283,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 106052,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Successfully clicked Confirmation page into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfully-clicked-confirmation-page-into-the-adactin-application-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@ConfirmationPage"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user click select radio button",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "KConfirmation_StepDefinition.user_click_select_radio_button()"
});
formatter.result({
  "duration": 5181329511,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmation_StepDefinition.user_click_continue_button()"
});
formatter.result({
  "duration": 7710053020,
  "status": "passed"
});
formatter.after({
  "duration": 114360,
  "status": "passed"
});
formatter.before({
  "duration": 151013,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 124134,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 92856,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Successfully clicked BookingPage into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfully-clicked-bookingpage-into-the-adactin-application-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@BookingPage"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user enter firstname",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user enter address",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user enter creditcardno",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enter creditcardtype",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user enter expmon of creditcard",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user enter expyear of creditcard",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user enter cvv",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user click logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_firstname()"
});
formatter.result({
  "duration": 317666913,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_lastname()"
});
formatter.result({
  "duration": 142166798,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_address()"
});
formatter.result({
  "duration": 199989639,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_creditcardno()"
});
formatter.result({
  "duration": 203024561,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_creditcardtype()"
});
formatter.result({
  "duration": 266961721,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_expmon_of_creditcard()"
});
formatter.result({
  "duration": 190101951,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_expyear_of_creditcard()"
});
formatter.result({
  "duration": 387040540,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_enter_cvv()"
});
formatter.result({
  "duration": 122323489,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_booKnow_button()"
});
formatter.result({
  "duration": 13125211797,
  "status": "passed"
});
formatter.match({
  "location": "LBooking_StepDefinition.user_click_logout_button()"
});
formatter.result({
  "duration": 6896474945,
  "status": "passed"
});
formatter.after({
  "duration": 136351,
  "status": "passed"
});
});