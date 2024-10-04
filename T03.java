// 12S24020 - Joice Anastasya Napitupulu
// 12S24014 - Arion Dippos Pandapotan Manurung

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, formatbuku, kualitas, jenisdiskon, conclusion;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        do {
            isbn = input.nextLine();
            if (!isbn.equals("---")) {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                hargapembelian = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    jenisdiskon = "---";
                } else {
                    if (minimummargin < -(hargapembelian * 40 / 100)) {
                        jenisdiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargapembelian * 20 / 100)) {
                            jenisdiskon = "Never come twice";
                        } else {
                            jenisdiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kualitas = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kualitas = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kualitas = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kualitas = "Average";
                            } else {
                                if (rating < 3.0) {
                                    kualitas = "Low";
                                } else {
                                    kualitas = "---";
                                }
                            }
                        }
                    }
                }
                if (jenisdiskon.equals("Once in a lifetime") && kualitas.equals("Best Pick")) {
                    conclusion = "The ultimate best";
                } else {
                    conclusion = "---";
                }
                System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kualitas + "|" + jenisdiskon + "|" + conclusion);
            }
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
