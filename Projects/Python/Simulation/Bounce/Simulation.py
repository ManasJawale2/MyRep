import random
import time
import pygame

class Ball:
    def __init__(self, x, y, width, height, color, Vy=.75, Vx=1):
        self.x = x
        self.y = y
        self.width = width
        self.height = height
        self.obj = pygame.Rect(x, y, width, height)
        self.color = color
        self.Vy = Vy
        self.Vx = Vx
        self.points = [(self.x+150/2, self.y+150/2)]

    def Move(self):
        self = Ball(self.x, self.y, self.width, self.height, self.color)
        self.points.append((self.x+150/2, self.y+150/2))
        self.Vy += .25
        if self.y + 150 > 720:
            self.Vy *= -1
        elif self.y + 150 == 720:
            self.Vy = 0
        if self.y <= 0:
            self.Vy *= -1
        if self.x + 150 >= 1280:
            self.Vx *= -.75
        if self.x <= 0:
            self.Vx *= -.75


pygame.init()
pygame.display.set_caption("Simulation.Bounce")
screen = pygame.display.set_mode((1280, 720))
screen.fill((0, 0, 0))
def Render(Text):
    return pygame.font.SysFont("Verdana", 16).render(Text, True, (255, 255, 255))
G = 9
x,y = random.randint(75, 525), random.randint(75, 200)
Vx, Vy = 1 , .75
circle = pygame.Rect(x, y, 150, 150)
# Box = pygame.Rect(500, 250, 100, 50)
points = [(circle.x+150/2, circle.y+150/2)]
acY = .25
done = False
startime = time.time()
currtime = time.time()

while not done:
    # pygame.time.delay(5)
    currtime = time.time()
    label5 = Render(f"Time:{str(currtime-startime)[0:4]}")
    label  = Render(f"X:{str(x)[0:5]}")
    label2 = Render(f"Y:{str(y)[0:5]}")
    label3 = Render(f"Vx:{str(Vx)[0:5]}")
    label4 = Render(f"Vy:{str(Vy)[0:5]}")
    Vy += acY
    # Vx -= .001 if Vx > 0 else -.001
    # Vx -= .01 if Vx > 0 else -.1
    y += Vy
    x += Vx
    circle = pygame.Rect(x, y, 150, 150)
    if y + 150 > 720:
        Vy *= -1
    elif y + 150 == 720:
        Vy = 0
        acY = 0
    if y <= 0:
        Vy *= -1
    if x + 150 >= 1280:
        Vx *= -.75
    if x <= 0:
        Vx *= -.75
    # if circle.colliderect(Box):
        # Vy = -Vy
        # Vx = -Vx
    points.append((circle.x+150/2, circle.y+150/2))
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = not done
    # screen.fill((0, 0, 0))
    pygame.draw.rect(screen, (255, 255, 255), circle, border_radius=100)
    # pygame.draw.rect(screen, (255, 255, 255), Box)
    pygame.draw.line(screen, (255, 0, 0), (circle.x+150/2, circle.y+150/2), (circle.x+150/2, circle.y+150/2))
    if Vy == 0 and y == 570:
        for i in range(len(points)):
            pygame.draw.line(screen, (255, 0, 0), points[i], points[i])
            pygame.display.update()
        pygame.time.delay(5000)
        done = not done
    pygame.display.update()