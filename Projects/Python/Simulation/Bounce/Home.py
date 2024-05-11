import pygame
pygame.init()

window = pygame.display.set_mode((700, 700))
window.fill((0, 25, 5))

EnterX = pygame.Rect()
done = False

while not done:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = not done
    window.fill((0, 25, 5))
    pygame.display.update()