class HarpicRun {

    public static void main(String[] values) {

        String variant1 = "Original Name";
        double volume1 = 530.0;
        String scent1 = "Lime";

        String variant2 = "Power House";
        double volume2 = 800.0;
        String scent2 = "Citrus";

        String variant3 = "Bathroom Cleaner";
        double volume3 = 1500.0;
        String scent3 = "Sealing";

        String variant4 = "Original";
        double volume4 = 200.0;
        String scent4 = "Floral";

        String variant5 = "Power Plus";
        double volume5 = 950.0;
        String scent5 = "Citrus";

        Harpic harpic1 = new Harpic(variant1, volume1, scent1);
        System.out.println("harpic1 Variant:" + harpic1.variant);
        System.out.println("harpic1 Volume:" + harpic1.volume + "ml");
        System.out.println("harpic1 Scent:" + harpic1.scent);
		
		System.out.println("*********************************");

        Harpic harpic2 = new Harpic(variant2, volume2, scent2);
        System.out.println("harpic2 Variant:" + harpic2.variant);
        System.out.println("harpic2 Volume:" + harpic2.volume + "ml");
        System.out.println("harpic2 Scent:" + harpic2.scent);
		
		System.out.println("*********************************");

        Harpic harpic3 = new Harpic(variant3, volume3, scent3);
        System.out.println("harpic3 Variant:" + harpic3.variant);
        System.out.println("harpic3 Volume:" + harpic3.volume + "ml");
        System.out.println("harpic3 Scent:" + harpic3.scent);
		
		System.out.println("*********************************");

        Harpic harpic4 = new Harpic(variant4, volume4, scent4);
        System.out.println("harpic4 Variant:" + harpic4.variant);
        System.out.println("harpic4 Volume:" + harpic4.volume + "ml");
        System.out.println("harpic4 Scent:" + harpic4.scent);
		
		System.out.println("*********************************");

        Harpic harpic5 = new Harpic(variant5, volume5, scent5);
        System.out.println("harpic5 Variant:" + harpic5.variant);
        System.out.println("harpic5 Volume:" + harpic5.volume + "ml");
        System.out.println("harpic5 Scent:" + harpic5.scent);
    }
}