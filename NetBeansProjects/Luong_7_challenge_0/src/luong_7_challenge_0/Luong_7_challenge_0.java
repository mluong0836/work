/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_challenge_0;

/**
 *
 * @author mluong
 */
public class Luong_7_challenge_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 501; i++) {
            if (isDivisibleby11(i) & isDivisibleby5(i)) {
                System.out.println("Animate this!");
            } else {
                if (isDivisibleby11(i) & isDivisibleby3(i)) {
                    System.out.println("Herr Direktor");
                } else {
                    if (isDivisibleby11(i) & isDivisibleby2(i)) {
                        System.out.println("Ninja");
                    } else {
                        if (isDivisibleby5(i) & isDivisibleby3(i) & isDivisibleby2(i)) {
                            System.out.println("Team Building");
                        } else {
                            if (isDivisibleby5(i) & isDivisibleby3(i)) {
                                System.out.println("Old School");
                            } else {
                                if (isDivisibleby3(i) & isDivisibleby2(i)) {
                                } else {
                                    if (isDivisibleby5(i)) {
                                        System.out.println("Vidal");
                                    } else {
                                        if (isDivisibleby3(i)) {
                                            System.out.println("Claughton");
                                        } else {
                                            if (isDivisibleby2(i)) {
                                                System.out.println("Davis");
                                            } else {
                                                System.out.println(i);
                                            }
                                        }
                                    }
                                }

                            }

                        }

                    }

                }
            }
        }

    }

    static boolean isDivisibleby2(int somenumber) {
        return (somenumber % 2 == 0);
    }

    static boolean isDivisibleby3(int somenumber) {
        return (somenumber % 3 == 0);
    }

    static boolean isDivisibleby5(int somenumber) {
        return (somenumber % 5 == 0);
    }

    static boolean isDivisibleby11(int somenumber) {
        return (somenumber % 11 == 0);
    }
}
