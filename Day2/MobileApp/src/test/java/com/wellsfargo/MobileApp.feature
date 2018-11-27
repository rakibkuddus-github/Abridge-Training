Feature: Develop a mobile application

	Scenario: Should be able to turn on Camera

		Given The camera is functionally normally
		When I invoke Mobile powerOn
		Then I expect the Camera to be turned on successfully

	Scenario: Mobile power on should interact with Camera ON

                Given The camera is mocked
                When I invoke Mobile powerOn
                Then I expect the Camera to be turned on successfully
		And I expect the mobile powerOn to interact with camera

