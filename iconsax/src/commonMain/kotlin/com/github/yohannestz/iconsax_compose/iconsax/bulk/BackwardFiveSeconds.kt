package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BackwardFiveSeconds: ImageVector
    get() {
        val current = _backwardFiveSeconds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BackwardFiveSeconds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.38f, y = 16.92f)
                horizontalLineToRelative(dx = -2.29f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.29f)
                arcToRelative(a = 0.78f, b = 0.78f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.56f)
                horizontalLineToRelative(dx = -2.29f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -0.31f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -0.68f)
                lineToRelative(dx = 0.76f, dy = -2.29f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = -0.51f)
                horizontalLineToRelative(dx = 3.06f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -2.52f)
                lineToRelative(dx = -0.26f, dy = 0.79f)
                horizontalLineToRelative(dx = 1.25f)
                arcToRelative(a = 2.28f, b = 2.28f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.56f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 3.48f)
                lineToRelative(dx = -0.24f, dy = 0.01f)
                lineToRelative(dx = 0.82f, dy = -1.02f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = -1.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.05f, dy1 = 0.12f)
                lineTo(x = 9.43f, y = 4.01f)
                lineTo(x = 9.41f, y = 4.05f)
                lineTo(x = 9.34f, y = 4.19f)
                lineTo(x = 9.29f, y = 4.32f)
                lineTo(x = 9.28f, y = 4.46f)
                verticalLineToRelative(dy = 0.2f)
                lineToRelative(dx = 0.04f, dy = 0.09f)
                lineToRelative(dx = 0.06f, dy = 0.14f)
                lineTo(x = 9.47f, y = 5.0f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = 0.11f)
                lineToRelative(dx = 0.08f, dy = 0.05f)
                lineToRelative(dx = 0.17f, dy = 0.06f)
                lineToRelative(dx = 0.09f, dy = 0.02f)
                lineToRelative(dx = 0.08f, dy = 0.01f)
                lineToRelative(dx = 0.07f, dy = -0.02f)
                horizontalLineToRelative(dx = 0.09f)
                arcToRelative(a = 8.15f, b = 8.15f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -6.33f, dy1 = 7.92f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -4.86f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -0.9f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.95f, dy1 = 5.76f)
                arcTo(horizontalEllipseRadius = 9.65f, verticalEllipseRadius = 9.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 3.48f)
            }
        }.build().also { _backwardFiveSeconds = it }
    }

@Suppress("ObjectPropertyName")
private var _backwardFiveSeconds: ImageVector? = null
