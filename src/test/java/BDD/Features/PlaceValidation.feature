Feature: PlaceValidation

    Feature Description

Scenario Outline: Verify that Add Place Functionality is working as expected
 Given AddPlace JSON Payload "<name>" "<language>" "<address>"
 When User wants to add new place with Post Request
 Then Place should be added through AddPlace API with a response code 200
 And "Status" is "OK"

Examples:
    | name | language | address |
    | Magic House  | Bengali | 5453 Addresses Road  |
    | Magiconical House  | hindi | 545357676 Addresses Road  |
    


