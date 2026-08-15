package string;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str="sanskruti";
		
		boolean[] visited =new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			if(visited[i]) 
				continue;// at beginning visited[0] = false
			
			int count =1;//Because we are already looking at one occurrence.
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(str.charAt(i) + " = " + count);
			
			
		}
	}

}
