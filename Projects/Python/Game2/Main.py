import random
import time
import pygame

pygame.init()

screen = pygame.display.set_mode((700, 700))
screen.fill((0, 255, 0))

done = False

player = pygame.Rect(350, 600, 50, 50)

# Types of Enemy
Basic_Enemy_Img = pygame.image.load("src\Projects\Python\Game2\Pictures\BasicEnemy.png")
Basic_Enemy = Basic_Enemy_Img.get_rect()
# Speed
speed = 1

enemy1 = random.randint(1, 4)
enemy1_Img = None

EnemyChange = (1, 0)

match enemy1:
    case 1:
        enemy1 = Basic_Enemy
        enemy1_Img = Basic_Enemy_Img
    case 2:
        enemy1 = Basic_Enemy
        enemy1_Img = Basic_Enemy_Img
        EnemyChange = (.5, .45)
        print ("ḍṅṅḍr̥ēṅṅḍ")
    case 3:
        enemy1 = Basic_Enemy
        enemy1_Img = Basic_Enemy_Img
    case 4:
        enemy1 = Basic_Enemy
        enemy1_Img = Basic_Enemy_Img


dicission = random.randint(1, 4)
dicission_length = random.randint(1, 50)

while not done:
    enemy1.y += EnemyChange[0]
    enemy1.x += EnemyChange[1]

    screen.fill((0, 255, 0))
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT]:
        player.left -= speed
    if keys[pygame.K_RIGHT]:
        player.left += speed

    # PlayerNotOut
    if player.x >= 700:
        player.x = 1
    if player.x <= 0:
        player.x = 699

    if enemy1.x >= 700:
        enemy1.x = 1
    if enemy1.x <= 0:
        enemy1.x = 699
    # Collision Check
    if player.colliderect(enemy1):
        speed = 0
        EnemyChange = (0, 0)
    if enemy1.y >= 700:
        enemy1.y = 0
        enemy1.x = random.randint(0, 700)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = not done
    pygame.draw.rect(screen, (0, 0, 255), player)
    screen.blit(enemy1_Img, enemy1)
    pygame.display.update()
