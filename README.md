# quartz-plat-quota-forge

`quartz-plat-quota-forge` explores platform engineering with a small Java codebase and local fixtures. The technical goal is to package a Java local lab for quota analysis with round-trip fixtures, lossless normalization checks, and documented operating limits.

## Reason For The Project

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Quartz Plat Quota Forge Review Notes

The first comparison I would make is `secret scope` against `quota pressure` because it shows where the rule is most opinionated.

## What It Does

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/quartz-plat-quota-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `secret scope` and `quota pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Java addition stays small enough to inspect in one sitting.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

The check exercises the source code and the review fixture. `recovery` is the high score at 238; `stress` is the low score at 153.

## Boundaries

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
