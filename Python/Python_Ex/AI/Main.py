import wikipedia

# Set language to English (optional, as English is the default)
wikipedia.set_lang("en")

# Search for a query
query = input("Enter Your Question:\n")
search_results = wikipedia.search(query)

page = wikipedia.page(search_results[0])
if search_results:
    # Fetch the content of the first search result
    print("Title:", page.title)
    print("URL:", page.url)
    print("Summary:", page.summary)
import tkinter as tk

# Create a main window instance
root = tk.Tk()

# Set the title of the window
root.title("My First Tkinter App")

# Set the size of the window
root.geometry("400x300")

custom_font = ("Helvetica", 20, "plain")

# Create a label widget with custom font
label = tk.Label(root, text="Hello, Tkinter!", font=custom_font)

# Pack the label widget into the main window
label.pack()

# Run the application's event loop
root.mainloop()