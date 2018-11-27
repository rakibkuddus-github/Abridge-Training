Feature: Develop a RPNCalculator application in Core Java.

	Scenario Outline: Should be able to perform addition
		Given the input is <rpnMathExpression>
		When I evaluate the rpn math expression
		Then I expect the <expectedResult>

		Examples:
			| rpnMathExpression | expectedResult |
			| "10 15 +"         | "25.0"         |		
			| "20 15 +"         | "35.0"         |	
			| "110 15.256 +"    | "125.256"      |
	
	 Scenario Outline: Should be able to perform subtraction
                Given the input is <rpnMathExpression>
                When I evaluate the rpn math expression
                Then I expect the <expectedResult>

                Examples:
                        | rpnMathExpression | expectedResult |
                        | "100 15 -"        | "85.0"         |
                        | "20 15 -"         | "5.0"          |
                        | "110 15.256 -"    | "94.744"       |

         Scenario Outline: Should be able to perform multiplication
                Given the input is <rpnMathExpression>
                When I evaluate the rpn math expression
                Then I expect the <expectedResult>

                Examples:
                        | rpnMathExpression | expectedResult |
                        | "100 15 *"        | "1500.0"       |
                        | "20 15 *"         | "300.0"        |
                        | "100 15.256 *"    | "1525.6"       |

         Scenario Outline: Should be able to perform division
                Given the input is <rpnMathExpression>
                When I evaluate the rpn math expression
                Then I expect the <expectedResult>

                Examples:
                        | rpnMathExpression | expectedResult |
                        | "100 15 /"        | "6.666"        |
                        | "20 15 /"         | "1.333"        |
                        | "100 25 /"        | "4.0"          |

         Scenario Outline: Should be able to compute complex rpn math
                Given the input is <rpnMathExpression>
                When I evaluate the rpn math expression
                Then I expect the <expectedResult>

                Examples:
                        | rpnMathExpression                  | expectedResult |
                        | "15 7 1 1 + - / 3 * 2 1 1 + + -"   | "5.0"          |

