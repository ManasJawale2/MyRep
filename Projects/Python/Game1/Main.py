import pygame
import random

pygame.init()
screen = pygame.display.set_mode((1280, random.randint(650, 700)))
pygame.display.set_caption("Completly Random")
screen.fill((0, 255, 0))

r = random.randint(1, 2)
 
done = False

x = random.randint(60, 540)
y = 600
# player_size = 66
player_size = random.randint(50, 100)

player = pygame.Rect(x, y, player_size, player_size)

X1, X2, X3, X4, X5 = random.randint(10, (1*1270)/5), random.randint((1*1270)/5, (2*1270)/5), random.randint((2*1270)/5, (3*1270)/5), random.randint((3*1270)/5, (4*1270)/5),random.randint((4*1270)/5, ((5*1270)/5)-10)
Y1, Y2, Y3, Y4, Y5 = random.randint(-100, 0), random.randint(-100, 0),random.randint(-100, 0),random.randint(-100, 0),random.randint(-100, 0)

sizes = [
    {"x": random.randint(50, 150), "y": random.randint(50, 150)},
    {"x": random.randint(50, 150), "y": random.randint(50, 150)},
    {"x": random.randint(50, 150), "y": random.randint(50, 150)},
    {"x": random.randint(50, 150), "y": random.randint(50, 150)},
    {"x": random.randint(50, 150), "y": random.randint(50, 150)},
    {"x": random.randint(50, 150), "y": random.randint(50, 150)}
]


obstacle1 = pygame.Rect(X1, Y1, 100, 50)
obstacle2 = pygame.Rect(X2, Y2, 100, 50)
obstacle3 = pygame.Rect(X3, Y3, 100, 50)
obstacle4 = pygame.Rect(X4, Y4, 100, 50)
obstacle5 = pygame.Rect(X5, Y5, 100, 50)

score = 0
label_score = pygame.font.SysFont("Verdana", 24, True).render(f"Score: {score}", True, (0, 0, 0))

GameOver_label = pygame.font.SysFont("Segoe UI Black", 200, True).render("GameOver!", False, (0, 0, 0))

difficulty = random.randint(1, 3)

speed = random.randint(1, 2)

draw_gameover = False

print (f"Size: {player_size}")


import random

alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZāḍēṅḥīl̥ṁṇōær̥śṭūṣñĀḌĒṄḤĪL̥ṀṆŌÆR̥ŚṬŪṢÑ0123456789 "
length = 10

i = 0

str = ""

r = random.randint(0, len(alp))

while i < length:
    r = random.randint(0, len(alp))
    str += alp[r]
    i+=1

if player_size == 66:
    pygame.display.set_caption(str)
while not done:
    if player_size == 66:
        label_score = pygame.font.SysFont("Verdana", 24, True).render("Ś₹ōr̥ē: ^", True, (0, 0, 0))
    else:
        label_score = pygame.font.SysFont("Verdana", 24, True).render(f"Score: {score}", True, (0, 0, 0))
    player = pygame.Rect(x, y, player_size, player_size)
    obstacle1 = pygame.Rect(X1, Y1, sizes[0].get("x"), sizes[0].get("y"))
    obstacle2 = pygame.Rect(X2, Y2, sizes[1].get("x"), sizes[1].get("y"))
    obstacle3 = pygame.Rect(X3, Y3, sizes[2].get("x"), sizes[2].get("y"))
    obstacle4 = pygame.Rect(X4, Y4, sizes[3].get("x"), sizes[3].get("y"))
    obstacle5 = pygame.Rect(X5, Y5, sizes[4].get("x"), sizes[4].get("y"))
    keys = pygame.key.get_pressed()
    if keys[pygame.K_RIGHT]:
        x += speed
    if keys[pygame.K_LEFT]:
        x -= speed
    if keys[pygame.K_F1]:
        if keys[pygame.K_KP_PLUS]:
            difficulty += .01
        elif keys[pygame.K_KP_MINUS]:
            difficulty -= .01

    if player.colliderect(obstacle1):
        speed = 0
        difficulty = 0
        draw_gameover = True
        # screen.blit(GameOver_label, (640, 350))
    if player.colliderect(obstacle2):
        speed = 0
        difficulty = 0
        draw_gameover = True
        # screen.blit(GameOver_label, (640, 350))
    if player.colliderect(obstacle3):
        # screen.blit(GameOver_label, (640, 350))
        speed = 0
        difficulty = 0
        draw_gameover = True
    if player.colliderect(obstacle4):
        # screen.blit(GameOver_label, (640, 350))
        speed = 0
        difficulty = 0
        draw_gameover = True
    if player.colliderect(obstacle5):
        # screen.blit(GameOver_label, (640, 350))
        speed = 0
        difficulty = 0
        draw_gameover = True
    if x < 0:
        x = 1250
    elif x > 1280:
        x = 30
    if Y1 > 1250:
        sizes[0] = {"x": random.randint(50, 150), "y": random.randint(50, 100)}
        score+=1
        X1 = random.randint(10, (1*1270)/5)
        Y1 = random.randint(-100, 0)
        obstacle1 = pygame.Rect(X1, Y1, sizes[0].get("x"), sizes[0].get("y"))
    if Y2 > 1250:
        sizes[1] = {"x": random.randint(50, 150), "y": random.randint(50, 100)}
        X2 = random.randint((1*1270)/5, (2*1270)/5)
        Y2 = random.randint(-100, 0)
        obstacle2 = pygame.Rect(X2, Y2, sizes[1].get("x"), sizes[1].get("y"))
    if Y3 > 1250:
        sizes[2] = {"x": random.randint(50, 150), "y": random.randint(50, 100)}
        X3 = random.randint((2*1270)/5, (3*1270)/5)
        Y3 = random.randint(-100, 0)
        obstacle3 = pygame.Rect(X3, Y3, sizes[2].get("x"), sizes[2].get("y"))
    if Y4 > 1250:
        sizes[3] = {"x": random.randint(50, 150), "y": random.randint(50, 100)}
        X4 = random.randint((3*1270)/5, (4*1270)/5)
        Y4 = random.randint(-100, 0)
        obstacle4 = pygame.Rect(X4, Y4, sizes[3].get("x"), sizes[3].get("y"))
    if Y5 > 1250:
        sizes[4] = {"x": random.randint(50, 150), "y": random.randint(50, 100)}
        X5 = random.randint((4*1270)/5, ((5*1270)/5)-10)
        Y5 = random.randint(-100, 0)
        obstacle5 = pygame.Rect(X5, Y5, sizes[4].get("x"), sizes[4].get("y"))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            print ("Leaving the game..")
            done = True
    screen.fill((0, 255, 0))
    Y1 += difficulty
    Y2 += difficulty
    Y3 += difficulty
    Y4 += difficulty
    Y5 += difficulty
    pygame.draw.rect(screen, (255, 0, 0), obstacle1)
    pygame.draw.rect(screen, (255, 0, 0), obstacle2)
    pygame.draw.rect(screen, (255, 0, 0), obstacle3)
    pygame.draw.rect(screen, (255, 0, 0), obstacle4)
    pygame.draw.rect(screen, (255, 0, 0), obstacle5)
    pygame.draw.rect(screen, (0, 0, 255), player)
    screen.blit(label_score, (10, 10))
    if draw_gameover:
        screen.blit(GameOver_label, (650, 650))
    pygame.display.update()
