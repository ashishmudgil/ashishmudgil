package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StockBuySellProblem {

	public static void main(String[] args) {
		//int stock[] = { 100, 180, 260, 310, 40, 535, 695 };
		int stock[] = { 50, 90, 130, 155, 20, 267, 347 };
		// int stock[] = { 100, 200, 150, 50, 500 };
		int profit = 0, buy = 0, sell = 0, pointer = 0;
		List<Integer> profitDiff = new ArrayList<Integer>();
		label: for (int j = 1; j < stock.length; j++) {
			if (stock[pointer] < stock[j]) {
				buy = stock[pointer];
				profitDiff.add(stock[j] - stock[pointer]);
				if (j == stock.length - 1) {
					sell = stock[j];
					profit += sell - buy;
					break label;
				}
			} else {
				if (j == 1) {
					pointer++;
					continue;
				}
				Optional<Integer> mapMaxprofit = profitDiff.stream().reduce(Integer::max);
				sell = stock[j - 1];
				profit += mapMaxprofit.get();
				pointer = j;
				profitDiff.removeAll(profitDiff);
			}
		}
		System.out.println(profit);
	}

}
