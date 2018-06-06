import java.util.Scanner;


public class macroSetup {
public static void main(String[] args) {
	while(true){
	System.out.println("SELECT YOUR CHOICE");
	System.out.println();
	System.out.println("1) KNOW YOUR MAINTAINANCE CALORIE PER DAY");
	System.out.println("2) MACROS(MICRONUTRIENTS) REQUIRED FOR CUTTING/SHREDDING PER DAY");
	System.out.println("3) MACROS(MICRONUTRIENTS) REQUIRED FOR BULKING PER DAY");
	Scanner scan = new Scanner(System.in);
	int br = scan.nextInt();
	switch(br){
	case 1:
		maintainance();
		break;
	case 2:
		cutting();
		break;
	case 3:
		bulk();
		break;
	default :
		System.out.println("select appropriate option");
		System.out.println();
	}
}
}

private static void bulk() {
	// TODO Auto-generated method stub
	Scanner sca = new Scanner(System.in);
	System.out.println("ENTER YOUR MAINTAINANCE CALORIE");
	int mCalorie = sca.nextInt();
	System.out.println("ENTER: (1) for Lean(body fat between 15%-17%) and (2) for Obese(body fat>20%)");
	int bodyType = sca.nextInt();
	if(bodyType==2){
		System.out.println("enter your body fat %");
		int bodyFat = sca.nextInt();
		System.out.println("enter your recent weight in pounds(lbs)");
		int weight = sca.nextInt();
		int fatPercentage = (weight * bodyFat)/100;
		int leanMass = weight - fatPercentage;
		int percentOfGain = (mCalorie * 15)/100;
		int gainingCalorie = mCalorie + percentOfGain;
		double protein = Math.ceil(leanMass * 1);
		double proteinCal = Math.ceil(protein * 4);
		int fat1 = (gainingCalorie * 20)/100;
		int fat2 = (gainingCalorie * 30)/100;
		int overAllFatCal = ((fat1 + fat2)/2)-35;
		int overAllFat = (overAllFatCal / 9) ;
		double carbCal = Math.ceil(gainingCalorie - overAllFatCal - proteinCal);
		double carb = carbCal/4;
		System.out.println("this is the macros for your gain in grams ");
		System.out.println("fat : "+overAllFat+" carb : "+carb+" protein : "+protein);
	}else{
	System.out.println("Enter Your Weight in pounds(lbs)");
	int weight = sca.nextInt();
	int percentOfGain = (mCalorie * 15)/100;
	int gainingCalorie = mCalorie + percentOfGain;
	double protein = Math.ceil(weight * 1);
	double proteinCal = Math.ceil(protein * 4);
	int fat1 = (gainingCalorie * 20)/100;
	int fat2 = (gainingCalorie * 30)/100;
	int overAllFatCal = ((fat1 + fat2)/2)-35;
	int overAllFat = (overAllFatCal / 9) ;
	double carbCal = Math.ceil(gainingCalorie - overAllFatCal - proteinCal);
	double carb = carbCal/4;
	System.out.println("this is the macros for your gains ");
	System.out.println("fat : "+overAllFat+" carb : "+carb+" protein : "+protein);
}

	System.out.println("keep tracking your macros");
	
	
}

private static void cutting() {
	// TODO Auto-generated method stub
	//System.out.println("this is the macros for your cutting/shredding ");
	Scanner sca = new Scanner(System.in);
	System.out.println("ENTER YOUR MAINTAINANCE CALORIE");
	int mCalorie = sca.nextInt();
	System.out.println("ENTER: (1) for Lean(body fat between 15%-17%) and (2) for Obese(body fat>20%)");
	int bodyType = sca.nextInt();
	if(bodyType==2){
		System.out.println("enter your body fat %");
		int bodyFat = sca.nextInt();
		System.out.println("enter your recent weight in pounds(lbs)");
		int weight = sca.nextInt();
		int fatPercentage = (weight * bodyFat)/100;
		int leanMass = weight - fatPercentage;
		int percentOfLoss = (mCalorie * 15)/100;
		int cuttingCalorie = mCalorie - percentOfLoss;
		double protein = Math.ceil(leanMass * 1.3);
		double proteinCal = Math.ceil(protein * 4);
		int fat1 = (cuttingCalorie * 15)/100;
		int fat2 = (cuttingCalorie * 25)/100;
		int overAllFatCal = ((fat1 + fat2)/2)-35;
		int overAllFat = (overAllFatCal / 9) ;
		double carbCal = Math.ceil(cuttingCalorie - overAllFatCal - proteinCal);
		double carb = carbCal/4;
		System.out.println("this is the macros for your cutting/shredding ");
		System.out.println("fat : "+overAllFat+" carb : "+carb+" protein : "+protein);
	}else{
	System.out.println("Enter Your Weight in pounds(lbs)");
	int weight = sca.nextInt();
	int percentOfLoss = (mCalorie * 15)/100;
	int cuttingCalorie = mCalorie - percentOfLoss;
	double protein = Math.ceil(weight * 1.3);
	double proteinCal = Math.ceil(protein * 4);
	int fat1 = (cuttingCalorie * 15)/100;
	int fat2 = (cuttingCalorie * 25)/100;
	int overAllFatCal = ((fat1 + fat2)/2)-35;
	int overAllFat = (overAllFatCal / 9) ;
	double carbCal = Math.ceil(cuttingCalorie - overAllFatCal - proteinCal);
	double carb = carbCal/4;
	System.out.println("this is the macros for your cutting/shredding ");
	System.out.println("fat : "+overAllFat+" carb : "+carb+" protein : "+protein);
}
	System.out.println("Note: keep tracking your macros");
}

private static void maintainance() {
	// TODO Auto-generated method stub
	//System.out.println("this is the macros for your current weight ");
	//System.out.println("keep tracking your macros");
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER: (1) for Lean(body fat between 15%-17%) and (2) for Obese(body fat>20%)");
	int bodyType = sc.nextInt();
	if(bodyType==1){
		System.out.println("enter your recent weight in pounds(lbs)");
		int weight = sc.nextInt();
		int mCalorie1 = weight * 14;
		int mCalorie2 = weight * 16;
		System.out.println("your maintainance calorie is ranged from " + mCalorie1+" calorie to "+mCalorie2+" calorie");
	}else{
		System.out.println("enter your body fat %");
		int bodyFat = sc.nextInt();
		System.out.println("enter your recent weight in pounds(lbs)");
		int weight = sc.nextInt();
		int fatPercentage = (weight * bodyFat)/100;
		int leanMass = weight - fatPercentage;
		int mCalorie1 = leanMass * 14;
		int mCalorie2 = leanMass * 16;
		System.out.println("your maintainance calorie is ranged from" + mCalorie1+"to"+mCalorie2);
	}
	
	
	
}

}