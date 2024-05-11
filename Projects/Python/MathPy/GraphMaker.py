import pygame
pygame.init()

values = []

for i in range(14):
    values.append(int(input("Enter Value: ")))

window = pygame.display.set_mode((700, 700))
window.fill((50, 50, 50))

done = False

x = 50
y = 650

while not done:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = not done
    pygame.draw.line(window, (255, 255, 255), (x, y), (x+50, values[1]))
    pygame.display.update()