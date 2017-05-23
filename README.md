Miwok App
===================================

This is my implementation of an application which displays lists of vocabulary words for the user to learn the Miwok language. The starter code with the Main Activity UI and the audio resources were provided by Udacity with the license http://www.apache.org/licenses/LICENSE-2.0
All the code after that has been added by me and uses the same copyright license.

This example implements:  
__ScrollView__ (so that text does not cut-off) and __LinearView__ layouts.  
-The text can cut-off if it's too long or if you rotate the device. To let the user scroll through our UI, all the XML was put into a ScrollView.  
__Intents__ (Send order via Whatsapp).  
-The intent will be sent even if the code below is removed in the Intent method: if (emailIntent.resolveActivity(getPackageManager()) != null) { startActivity(emailIntent); } But if the system cannot find an application which can receive this type of intent, then the app will crash.  
__OnClick method__ on buttons (To increase/decrease order quantity and to send the order to a third party service/spplication).  
-The quantity is increased or decreased according to if the user presses "+" or "-" button. But the quantity cannot go below 0 or above 100 (It can but we coded it not to, you can code different minimum and maximum values or let it increase or decrease infinitely, in which case the app can crash if the value increases/decreases than the data type's bounds).  
-The Order button sends the OrderSummary to Whatsapp.  
__Localization__ (Some strings have been translated to Spanish)  
__EditText__ (We get the name of the user which he/she enters)  
-android:hint tells user what should he type in the Textbox (saves space using this method instead of writing "Name:" in front of an input text box.).
