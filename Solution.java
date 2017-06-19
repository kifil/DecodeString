public class Solution {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println(args[0]);
    for(String result:getStringPermutations("123"){
    	System.out.println(result);
    }
  }
  
	HashMap<String,ArrayList<String>> memo = new HashMap<>();


	ArrayList<String> getStringPermutations(String inputString){
		ArrayList<String> results = new ArrayList<>();
		
		if(inputString == null || inputString == ""){
			return null;
		}
		else if(memo.hasKey(inputString)) {
			return memo.get(inputString);
		}
		else if(inputString.length() == 1){
			results.add(stringToChar(inputString))
			return results;
		}
		else if inputString.length() == 2 && isValid2charString()){
			results.add(stringToChar(inputString))
		}
	
		//need ot sonme bound checking
		for(String firstCharResult : decodeWord(firstChar)){
			for(String remainingWord : decodeWord(inputString-firstChar)){
				results.add(firstCharReslut + remainingWord);
				//a + b
				//a + (f)
				//a
			}
		}
		//b + c
	
		for(String twoCharResult : decodeWord(first2chars)){ //f
			for(String remainingWord : decodeWord(inputString-first2Chars)){ //""
				results.add(twoCharResult + remainingWord);
				//z
			}
		}
	
		//12 = ab,f
		memo.add(inputString,results);
	
		return memo.get(inputString);
	}
	
	public Boolean isValid2charString(){
		return false;
	}
}
