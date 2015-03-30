package gmfagundes.effy_easyfoodforyou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gmfagundes on 3/28/2015.
 */

//classe com todas as informacoes do aplicativo (dados)

public class Data
{
    public static int selectedCategory;
    public static int selectedRecipe;
    public static ArrayList<Category> categories;
    private static Map<Integer, Map<Integer, Boolean>> favoritesMap  = new HashMap<Integer, Map<Integer, Boolean>>();

    public static boolean isFavorite(int category, int recipe) {
        Map<Integer, Boolean> categoryMap = favoritesMap.get(category);
        if (categoryMap == null) {
            return false;
        }
        Boolean recipeValue = categoryMap.get(recipe);
        if (recipeValue == null) {
            return false;
        }
        return recipeValue;
    }

    public static void setFavorite(int category, int recipe, boolean value) {
        Map<Integer, Boolean> categoryMap = favoritesMap.get(category);
        if (categoryMap == null) {
            categoryMap = new HashMap<Integer, Boolean>();
        }
        categoryMap.put(recipe, value);
    }

    public static void initData()
    {
        Data.selectedCategory = 0;

        Data.selectedRecipe = 0;

        //Categorias
        Data.categories = new ArrayList<Category>();

        Data.categories.add( new Category( "Paninis" ) );
        Data.categories.add( new Category("Subs") );
        Data.categories.add( new Category("Wraps") );

        //Receitas
        //Panini
        Data.categories.get(0).getListRecipe().add(new Recipe("Tomato-Bacon", "8 slices bacon\n1/3 cup plain Greek yogurt\n1 tablespoon chopped oregano\n1 small clove garlic, minced kosher salt\n2 beefsteak tomatoes, sliced\n1 avocado, sliced lettuce leaves\n8 slices white sandwich bread, toasted", "\n" +
                "Cook the bacon in batches in a large skillet over medium heat until crisp, 12 to 15 minutes.\n\nCombine the yogurt, oregano, garlic, and ¼ teaspoon salt in a small bowl.\n\nDivide the bacon, garlic mayonnaise, tomatoes, avocado, and lettuce leaves among the bread.", "tomatobaconpanini"));
        Data.categories.get(0).getListRecipe().add(new Recipe("Roast Beef Tomato\n", "4 plum tomatoes, quartered\n2 tablespoons olive oil\n1 teaspoon \n" +
                "chopped\nRosemary kosher salt and black pepper\n1/4 cup sour cream\n2 \n" +
                "tablespoons prepared horseradish\n1 bunch arugula\n1 tablespoon fresh lemon \n" +
                "juice\n8 ounces sliced roast beef\n8 slices multigrain sandwich bread, toasted", "Heat oven to 400° F (200° C) . Toss the tomatoes, 1 tablespoon of the oil, \n" +
                "rosemary, and ¼ teaspoon salt in a 9-by-13-inch baking dish. Roast until very \n" +
                "tender, 20 to 25 minutes. Let cool.\n" +
                "Meanwhile, combine the sour cream, horseradish, and ¼ teaspoon pepper in a \n" +
                "small bowl.\n\n" +
                "Toss the arugula, lemon juice, and the remaining tablespoon of oil in a medium \n" +
                "bowl.\n\n" +
                "Divide the tomatoes, horseradish cream, arugula, and roast beef among the \n" +
                "bread.", "roastbeeftomatopanini"));
        Data.categories.get(0).getListRecipe().add(new Recipe("Toasted Cheese", "White bloomer\nUnsalted butter\nRed Leicester cheese\nCheddar cheese", "A toasted cheese sandwich is a beautiful thing, but I'm not messing about here – this is the ultimate one and it's going to blow your mind. But there is a particular sequence of events that needs to happen in order to achieve the most ridiculously tasty, chomp-worthy sandwich. Follow this recipe, and it will always make you feel good. It is also especially useful when you're suffering from a light hangover. This is when the condiments – dolloped onto a side plate like a painter's palette – really come into their own.\n\n" +
                "With the No. 1 toasted cheese sarnie we don't score any points for buying expensive, artisan bread. It's important to go for something neutral, and in my eyes, only a white bloomer will do. Lightly butter the bread on both sides (oh, and if you've got any leftover mashed potato, spread that across one piece of the bread – it's insanely good). To one piece of bread, add a nice grating of good-quality cheese that melts well, like Cheddar, Red Leicester or a mixture of the two. Place your second piece of bread on top, then cook in a sturdy non-stick frying pan on a medium heat for about 3 minutes on each side. This is important, because if it gets too coloured too quickly you won't get the gorgeous ooze and melt in the middle, and this is all about encouraging that internal cheese lava flow. As it cooks, I like to rest something flat with a little weight on top to ensure maximum surface area and crunch.\n\n" +
                "When lightly golden on both sides, lift the toastie out of the pan and grate a little layer of cheese into the pan where it was sitting. Place the toastie back on top and grate some more cheese on the top side. Leave it for just over 1 minute – wait for the cheese to bubble and the fat to spill out of it, then add a little pinch of cayenne pepper. Give the toastie a poke with a fish slice, and once it has a cheesy, doily-like crust on the bottom that moves as one, lift the toastie out of the pan and hold it on the fish slice for 30 seconds so the melted cheese hangs down, sets hard and forms an impressive cheese crown. Flip it onto the other side and once golden, serve, remembering to let it cool for a couple of minutes before attempting to tuck in.\n\n" +
                "The final debate is what do you want on the side? Tomato ketchup, brown sauce, a shake of Tabasco or hot sauce\\, mango chutney or a mixture? All are fine choices.", "toastedcheesepanini"));
        //Subs
        Data.categories.get(1).getListRecipe().add(new Recipe("Egg, Frisee and Caramelized Onion", "2 tablespoons olive oil\n1 medium onion, sliced kosher salt and black pepper\n4 large eggs\n2 tablespoons fig or blackberry jam frisée leaves\n4 brioche rolls, split and toasted", "Heat the oil in a large nonstick skillet over medium heat. Add the onion and ¼ teaspoon each salt and pepper and cook, stirring often, until golden, 15 to 18 minutes. Transfer to a plate; reserve the skillet.\n\n" +
                "Add the eggs to the skillet and cook, covered, 2 to 4 minutes for slightly runny yolks. Season with ¼ teaspoon each salt and pepper. Divide the onion, fig jam, frisée leaves, and eggs among the brioche rolls.", "eggfriseecaramelizedonionsub"));
        Data.categories.get(1).getListRecipe().add(new Recipe("French Ham", "1/3 cup finely chopped cornichons\n4 tablespoons\n(1/2 stick) unsalted butter, at room temperature\n1/4 cup Dijon mustard\n2 tablespoons chopped tarragon black pepper\n8 ounces sliced deli ham\n4 ounces Comté or Gruyère, sliced\n1 large baguette, split", "Combine the cornichons, butter, mustard, tarragon, and ¼ teaspoon pepper in a small bowl.\n\n" +
                "Spread the pickle mixture on the baguette. Top with the ham and cheese. Cut into 4 sandwiches\n", "frenchhamsub"));
        Data.categories.get(1).getListRecipe().add(new Recipe("Reuben-ish", "2 big slices rye bread, 1cm in size\nlow fat mayonnaise\n3 heaped tablespoons sauerkraut\n1 fresh red chilli, deseeded and finely sliced\n3 slices pastrami\na few gherkins\n60 g Swiss cheese\n1 handful watercress leaves", "The origin of the Reuben sandwich is hotly disputed, but many New Yorkers say it began in Reuben's Deli on East 58th Street. A classic Reuben sandwich should have Thousand Island dressing, but this is my version. Try it with nice smoked ham if you can't find pastrami.\n\n" +
                "Grill the slices of bread on a griddle pan until lightly toasted on both sides then spread one side of each with mayonnaise. Put some of the sauerkraut and some of the chilli on 2 of the slices, and top with a couple of slices of pastrami. Top with the remaining sauerkraut and chilli and the sliced gherkins, then grate the Swiss cheese over the top.\n\n" +
                "Preheat a hot grill. Place the slices with toppings under the grill until the cheese is melted and dribbling.\n" +
                "Stack the sandwich together, adding a few watercress leaves and finishing with the final slice of toast. Press down lightly and use wooden skewers to hold together.", "reubenishsub"));
        //Wraps
        Data.categories.get(2).getListRecipe().add(new Recipe("Curry Chicken", "1 cup plain fat-free yogurt\n3 tablespoons curry powder\n3 tablespoons lime juice, divided\n4 (6-ounce) skinless, boneless chicken breast halves\n10 cilantro sprigs\n6 garlic cloves, crushed\n2 cups chopped nectarines\n3/4 cup finely sliced green onions\n1/3 cup mango chutney\n2 tablespoons chopped fresh cilantro\n2 tablespoons chopped fresh mint\n1 tablespoon grated peeled fresh ginger\n1/4 teaspoon ground red pepper\n1/2 teaspoon salt\nCooking spray\n6 (1.9-ounce) light whole-wheat flatbreads (such as Flatout)\n24 (1/8-inch-thick) slices cucumber\n1 1/2 cups loosely packed baby arugula\n1 cup vertically sliced red onion", "\n" +
                "Combine yogurt, curry, and 1 tablespoon lime juice in a large heavy-duty zip-top plastic bag; squeeze bag to mix. Cut 3 shallow slits in each chicken breast. Add chicken, cilantro sprigs, and garlic to bag, squeezing to coat chicken. Seal and marinate in the refrigerator for 2 hours, turning occasionally.\n\n" +
                "Combine remaining 2 tablespoons lime juice, nectarines, and next 6 ingredients (through red pepper) in a bowl; toss gently. Cover and set aside.\n\n" +
                "Preheat grill to medium-high heat.\n" +
                "Remove chicken from bag; discard marinade. Sprinkle chicken with salt; place chicken on grill rack coated with cooking spray. Cover and grill for 4 minutes on each side or until chicken is done. Let stand 5 minutes. Cut chicken across the grain into thin slices.\n\n" +
                "Place 1/3 cup nectarine chutney in center of each flatbread. Divide chicken evenly among flatbreads. Top each with 4 cucumber slices, 1/4 cup arugula, and about 2 1/2 tablespoons red onion; roll up. Cut each wrap in half diagonally.", "currychickenwrap"));
        Data.categories.get(2).getListRecipe().add(new Recipe("Grilled Chicken", "1/2 cup canola mayonnaise\n3 tablespoons white wine vinegar, divided\n2 1/2 \n" +
                "teaspoons black pepper, divided\n1/4 teaspoon kosher salt, divided\n1 teaspoon \n" +
                "fresh lemon juice\n1 cup shredded cabbage\n2 teaspoons bread-and-butter pickle \n" +
                "juice\n2 (6-ounce) skinless, boneless chicken breast halves\nCooking spray\n4 \n" +
                "light flatbread sandwich wraps (such as Flatout Light Original)\n4 sandwich-cut \n" +
                "bread-and-butter pickles", "Preheat grill to medium-high heat.\n" +
                "Combine mayonnaise, 2 tablespoons vinegar, 2 teaspoons black pepper, 1/8 \n" +
                "teaspoon salt, and lemon juice in a small bowl, stirring well. Combine 1 \n" +
                "tablespoon vinegar, cabbage, and pickle juice in a medium bowl; toss.\n\n" +
                "Sprinkle chicken with 1/2 teaspoon black pepper and 1/8 teaspoon salt. Place \n" +
                "chicken on a grill rack coated with cooking spray, and grill for 6 minutes on \n" +
                "each side or until done. Cool; shred chicken. Combine chicken and mayonnaise \n" +
                "mixture in a medium bowl; toss to coat. Place one flatbread on each of 4 \n" +
                "plates; divide chicken mixture evenly among flatbreads. Top each serving with \n" +
                "about 1/4 cup cabbage mixture and 1 pickle; roll up. Cut each wrap in half \n" +
                "diagonally.", "grilledchickenwrap"));
        Data.categories.get(2).getListRecipe().add(new Recipe("Grilled Veggie and Humus", "4 (1/2-inch-thick) slices red onion\n1 red bell pepper, seeded and quartered\n1 (12-ounce) eggplant, cut into 1/2-inch-thick slices\n2 tablespoons olive oil, divided\n1/4 cup chopped fresh flat-leaf parsley\n1/8 teaspoon kosher salt\n1 (8-ounce) container plain hummus\n4 (1.9-ounce) whole-grain flatbreads (such as Flatout Light)\n1/2 cup crumbled feta cheese", "Heat a large grill pan over medium-high heat. Brush onion, bell pepper, and eggplant with 1 tablespoon oil. Add onion and bell pepper to pan; cook 3 minutes on each side or until grill marks appear. Remove from pan. Add eggplant to pan; cook 3 minutes on each side or until grill marks appear. Remove from pan; coarsely chop vegetables. Combine vegetables, remaining 1 tablespoon oil, parsley, and salt; toss to combine.\n" +
                "Spread 1/4 cup hummus over each flatbread, leaving a 1/2-inch border around edges. Divide vegetables over each flatbread; top each serving with 2 tablespoons cheese. Roll up wraps, and cut diagonally in half.", "grilledveggiehummuswrap"));


    }


    public static Recipe getSelectedRecipe() {
        return Data.categories.get(Data.selectedCategory).getListRecipe().get(Data.selectedRecipe);
    }
}
