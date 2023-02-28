# The Shoe Store

This project will consist of five screens. You don't have to create a shoe store, you can use any other item as long as you create the following screens. You will be creating:

1. Login screen: Email and password fields and labels plus create and login buttons
2. Welcome onboarding screen
3. Instructions onboarding screen
4. Shoe Listing screen
5. Shoe Detail screen for adding a new shoe

## Getting Started

Open the starter project in the latest stable version of Android Studio.

Open the starter project in Android Studio

## Steps

- [:heavy_check_mark:] Add the navigation libraries to the app build.gradle file 
- [:heavy_check_mark:] Add the safe-arg plugin to the main and app build.gradle file 
- [:heavy_check_mark:] Create a new navigation xml file
- [:heavy_check_mark:] Set DataBindingUtil in build.gradle
- Use DataBindingUtil to inflate every layout 

- [:heavy_check_mark:] Create a new Login destination.

   * [:heavy_check_mark:] Include email and password labels
   - [:heavy_check_mark:] Include email and password fields
   - [:heavy_check_mark:] Create buttons for creating a new login and logging in with an existing account
   - Clicking either button should navigate to the Welcome Screen.

- [:heavy_check_mark:] Create a new Welcome screen destination that includes:

   * [:heavy_check_mark:] A new layout
   * [:heavy_check_mark:] At least 2 textviews
   * [:heavy_check_mark:] A navigation button with actions to navigate to the instructions screen

1. Create a new Instruction destination that includes:

   * [:heavy_check_mark:] A new layout
   * [:heavy_check_mark:] At least 2 textviews
   * [:heavy_check_mark:] A navigation button with actions to navigate to the shoe list screen

2. Create a class that extends ViewModel

   * Use a LiveData field that returns the list of shoes

3. Create a new Shoe List destination that includes:

   * A new layout
   * A ScrollView
   * A LinearLayout for Shoe Items
   * A FloatingActionButton with an action to navigate to the shoe detail screen

4. In MainActivity, setup the nav controller with the toolbar and an AppBarConfiguration.

5. Create a new Shoe Detail destination that includes:

   * A new layout
   * A TextView label and EditView for the
     * Shoe Name
     * Company
     * Shoe Size
     * Description
   * A Cancel button with an action to navigate back to the shoe list screen
   * A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model

6. Make sure you can’t go back to onboarding screens

7. In the Shoe List screen:

   * Use an Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
   * Observe the shoes variable from the ViewModel
   * Use DataBindingUtil to inflate the shoe_list layout
   * Add a new layout item into the scrollview for each shoe.