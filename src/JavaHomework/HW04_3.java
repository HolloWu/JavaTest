package JavaHomework;

public class HW04_3 {
	public static void main(String[] args) {
		int count=0;
		String planets[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		for(int i=0;i<8;i++) {
			for(int j=0;j<planets[i].length();j++) {
				if(planets[i].charAt(j)=='a'||planets[i].charAt(j)=='e'||planets[i].charAt(j)=='i'||planets[i].charAt(j)=='o'||planets[i].charAt(j)=='u') {
					count++;
				}
//				switch(planets[i].charAt(j)) {
//				case 'a':
//					count++;
//					break;
//				case 'e':
//					count++;
//					break;
//				case 'i':
//					count++;
//					break;
//				case 'o':
//					count++;
//					break;
//				case 'u':
//					count++;
//					break;
//				}
			}
		}
		System.out.print(count);
	}
}
