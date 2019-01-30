main(calcilator) {
	number1  = askNumber();
    	operation = askOperation();
    	number2  = askNumber();
    	
	if operation is + then result = calculateSum();
    	if operation is -  then result = calculateDifference();
    	if operation is * then result = calculateMultiply()
   	if operation is / then result = calculateDivide()
    
	showResult();
}
