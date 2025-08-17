public class main {

    public static void main(String [] args) {
        //2D  array = An array where each element is an array
        //            Useful for storing a  matrix of data


//String[] fruits= {"apple", "orange", "banana"};
//String[] vegetables= {"pptato", "onion", "carrot"};
//String[] meats= {"chiken", "pork", "fish"};

//String[][] groceries ={fruits, vegetables, meats};

        String[][]groceries= {{"apple", "orange", "banana"},
                              {"pptato", "onion", "carrot"},
                              {"chiken", "pork", "fish"}};
        groceries[1][0]="celery";
for(String[] foods : groceries){

//    System.out.print(foods);
    for (String food: foods){
        System.out.println(food);
    }
    System.out.println();
}





    }


}
