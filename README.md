# Discount on Appeal

# Introduction

This project is a System design of the below problem statement.

# Problem Statement

*****************   Discounts on apparel **********************

This shopping season you are having fun at the Mall. The Mall owner, himself, is quite stressed out having to manage the influx of customers.
He is struggling to calculate the discounts that he has on his clothing line. You decide to help him out by building a system that calculates the discounts on all the applicable items a customer has bought.

There are several categories of products. In fact, categories have subcategories which themselves can have subcategories. Below is a diagram.
Casuals is a subcategory of Trousers, which by itself is a subcategory of Men's wear. Some categories have discounts.

            Men's wear                        Women's wear (50% off)
            |- Shirts                          |- Dresses
            |- Trousers                        |- Footwear
             |- Casuals (30% off)
            |- Jeans   (20% off)

Each product you have belongs to a brand which by themselves are running discounts. Below is a table that lists them:
Brands Discounts:
Wrangler             10%
Arrow                20%
Vero Moda            60%
UCB                  None
Adidas               5%
Provogue             20%

This way, a product can have three types of discounts applicable:
1. Discount on the brand
2. Discount on the category
3. Discount on the ancestor category (e.g. Footwear doesn't have a discount, but it's parent category Women's wear has 50% off). It is worth noting, that it is an ancestor: not just a direct parent, anyone in the lineage.

The discount that is applied is the greatest of the above three. For example, if the customer buys a Jeans of Wrangler Brand, the discounts are:
1. Discount on brand: 10%
2. Discount on category (Jeans): 20%
3. Discount on parents (Trousers, Men's wear): None
So, the discount that is applied 20%.

Inventory (the list of items that shop has):
--------------------------------------------------------------------------
Id | Brand            | Category          | Price    | Discounted Price
--------------------------------------------------------------------------
1  | Arrow            | Shirts            | 800      | 640
2  | Vero Moda        | Dresses           | 1400     | 560
3  | Provogue         | Footwear          | 1800     | 900
4  | Wrangler         | Jeans             | 2200     | 1760
5  | UCB              | Shirts            | 1500     | 1500
--------------------------------------------------------------------------

You will be given the above table (without discounted price) in CSV form as standard input. This is the shop inventory.
You'll also get the customer options as comma separated Id's after a newline. In the example below, 1,2,3,4 are the customer choices.

Sample Input:

5
1, Arrow,Shirts,800
2, Vero Moda,Dresses,1400
3, Provogue,Footwear,1800
4, Wrangler,Jeans,2200
5, UCB,Shirts,1500

2
1,2,3,4
1,5

Expected output:
3860
2140

# Design & Assumption

  * Assumptions :
    Following are the assumptions are made while developing this application -
    1. Men's wear & Women's wear are the only base categories, i.e., There is no other ancestor of these categories
    2. This application supports only the above Brands and Categories provided in the problem statement. There is no
    support for dynamic addition of Brand and Categories.
    3. "None" discount percent is considered as 0 discount percent
    4. "Casuals" category is considered as child category of "Trousers" as it is mentioned in the problem statement.

  * Design :
    Following is the class responsibility definitions :
    1. Main.java -> Program execution start point. It accepts the inventory item detail list along with the test cases from
    standard input.
    2. SGMallDiscountRule.java - > This service calculates the maximum discount that would be application for an item. This
    service is used by SGItemPriceCalculator.java to calculate the Item price after discount.
    3. SGItemPriceCalculator.java -> Calculates the final Item price after applying discount.
    4. These factories (ItemFactory.java, BrandFactory.java and CategoryFactory.java) are used to construct Item, Brand
    and Categories objects.
    5. Entities are created to represent different entities applicable

# How to Run
    To Run the application :
    1. Execute main() method of Main.java class and provide the following command line inputs -

    5                                   # Number of Inventory Items  (Here it is provided as 5)
    1, Arrow,Shirts,800                 # Inventory Item No - 1
    2, Vero Moda,Dresses,1400           # Inventory Item No - 2
    3, Provogue,Footwear,1800           # Inventory Item No - 3
    4, Wrangler,Jeans,2200              # Inventory Item No - 4
    5, UCB,Shirts,1500                  # Inventory Item No - 5

    2                                   # Number of Test cases (Here it is provided as 2)
    1,2,3,4                             # Comma separated Item Ids - Test Case No - 1
    1,5                                 # Comma separated Item Ids - Test Case No - 2

    2. Once the input is provided as mentioned above, Total price for each test case ids will be printed.
    For the above case the below lines will be printed -

    3860        # Total price for the items Ids 1, 2, 3, 4 ( Test Case #1)
    2140        # Total price for the items Ids 1, 5 ( Test Case #2)

# Whom to Reach
    For any query and suggestion  please reach out to suman.dutta05@gmail.com