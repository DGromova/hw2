public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte glass = 3;
        short pines = 1005;
        int people = 7000;
        long bus = 655432L;
        float parts = 67.678f;
        double glassWeight = 300;
        char n = 36;
        boolean peopleNumber =  people > 10;
        System.out.println(peopleNumber);
        // Задача 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double totalWeight = firstBoxer+secondBoxer;
        System.out.println("Общий вес боксеров равен "+totalWeight+ " кг.");
        double differenceBetweenWeights = firstBoxer - secondBoxer ;
        System.out.println ("Разница в весе боксеров равна "+ Math.abs(differenceBetweenWeights)+" кг.");
        // Задача 3
        int bananas = 5;
        int oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;
        int milkVolume = 200;
        int milk100gWeight = 105;
        int milkWeight = milkVolume * milk100gWeight / 100;
        int iceCream = 2;
        int oneIceCreamWeighht = 100;
        int iceCreamWeight = iceCream * oneIceCreamWeighht;
        int eggs = 4;
        int oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;
        double totalBreakfastWeightGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalBreakfastWeightKg = totalBreakfastWeightGram / 1000;
        System.out.println("Вес спорт-завтрака составляет " + totalBreakfastWeightKg + " кг.");
        // Задача 4
        int weightLossKg = 7;
        int weightLossGram = weightLossKg * 1000;
        double daysOfSlowWeightLoss = Math.ceil(weightLossGram / 250);
        System.out.println("Если спортсмен в день будет терять 250 грамм, то 7 кг он сбросит через " + Math.round(daysOfSlowWeightLoss) + " дней.");
        double daysOfFastWeightLoss = Math.ceil(weightLossGram / 500);
        System.out.println("Если спортсмен в день будет терять 500 грамм, то 7 кг он сбросит через " + Math.round(daysOfFastWeightLoss) + " дней.");
        double averageDaysLoseWeight = (daysOfSlowWeightLoss + daysOfFastWeightLoss) / 2;
        System.out.println("В среднем для похудения может потребоваться " + Math.round(averageDaysLoseWeight) + " день.");
        // Задача 5
            //Маша
        float mashaSalary = 67760f;
        float mashaSalaryIncrease = mashaSalary * 1.1f;
        float mashaRevenueBeforeIncrease = mashaSalary * 12;
        float mashaRevenueAfterIncrease = mashaSalaryIncrease * 12;
        float mashaSalaryDifferance = mashaRevenueAfterIncrease - mashaRevenueBeforeIncrease;
            //Денис
        float denisSalary = 83690f;
        float denisSalaryIncrease = denisSalary * 1.1f;
        float denisRevenueBeforeIncrease = denisSalary * 12;
        float denisRevenueAfterIncrease = denisSalaryIncrease * 12;
        float denisSalaryDifferance = denisRevenueAfterIncrease - denisRevenueBeforeIncrease;
            //Кристина
        float kristinaSalary = 76230f;
        float kristinaSalaryIncrease = kristinaSalary * 1.1f;
        float kristinaRevenueBeforeIncrease = kristinaSalary * 12;
        float kristinaRevenueAfterIncrease = kristinaSalaryIncrease * 12;
        float kristinaSalaryDifferance = kristinaRevenueAfterIncrease - kristinaRevenueBeforeIncrease;
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaSalaryDifferance + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisSalaryDifferance + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryDifferance + " рублей.");
    }
}