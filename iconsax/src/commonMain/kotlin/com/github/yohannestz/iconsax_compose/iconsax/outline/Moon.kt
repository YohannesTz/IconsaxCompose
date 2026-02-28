package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Moon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.46f, y = 22.75f)
                lineToRelative(dx = -0.51f, dy = -0.01f)
                arcTo(horizontalEllipseRadius = 11.26f, verticalEllipseRadius = 11.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.28f, y1 = 12.48f)
                arcTo(horizontalEllipseRadius = 11.1f, verticalEllipseRadius = 11.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.07f, y1 = 1.5f)
                curveToRelative(dx1 = 1.25f, dy1 = -0.52f, dx2 = 1.9f, dy2 = -0.12f, dx3 = 2.19f, dy3 = 0.17f)
                curveToRelative(dx1 = 0.28f, dy1 = 0.28f, dx2 = 0.67f, dy2 = 0.93f, dx3 = 0.15f, dy3 = 2.12f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.68f, dy1 = 3.35f)
                arcToRelative(a = 8.57f, b = 8.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 10.1f, dy1 = 8.24f)
                curveToRelative(dx1 = 1.32f, dy1 = -0.24f, dx2 = 1.87f, dy2 = 0.29f, dx3 = 2.08f, dy3 = 0.63f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = 1.07f, dx2 = -0.35f, dy2 = 2.15f)
                arcToRelative(a = 11.2f, b = 11.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.1f, dy1 = 4.59f)
                moveToRelative(dx = -9.7f, dy = -10.38f)
                arcToRelative(a = 9.75f, b = 9.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 17.58f, dy1 = 4.9f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = -0.43f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.03f)
                arcTo(horizontalEllipseRadius = 10.09f, verticalEllipseRadius = 10.09f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.22f, y1 = 7.16f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.04f, y1 = 3.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.13f, dy1 = -0.45f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.51f, dy1 = 0.13f)
                arcToRelative(a = 9.6f, b = 9.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.9f, dy1 = 9.49f)
            }
        }.build().also { _moon = it }
    }

@Suppress("ObjectPropertyName")
private var _moon: ImageVector? = null
