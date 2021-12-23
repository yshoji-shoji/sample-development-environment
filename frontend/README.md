# How to run container

## Build image

Run `pack build` for building container image.

```bash
pack build sample-frontend-development-app --builder heroku/buildpacks:20 --descriptor project.development.toml
```

Confirm target image was built.

```bash
docker images
```

## Run container with docker-compose

```bash
docker compose up -d
```

Confirm target container is running

```bash
docker ps
```

Open browser http://localhost:3000.
