package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayCircle: ImageVector
    get() {
        val current = _playCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PlayCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 22.75f)
                curveTo(x1 = 6.05f, y1 = 22.75f, x2 = 1.22f, y2 = 17.93f, x3 = 1.22f, y3 = 12.0f)
                reflectiveCurveTo(x1 = 6.05f, y1 = 1.25f, x2 = 11.97f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.72f, y1 = 6.07f, x2 = 22.72f, y2 = 12.0f)
                reflectiveCurveTo(x1 = 17.9f, y1 = 22.75f, x2 = 11.97f, y2 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.56f, y = 17.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = -0.33f)
                curveToRelative(dx1 = -0.86f, dy1 = -0.5f, dx2 = -1.34f, dy2 = -1.48f, dx3 = -1.34f, dy3 = -2.76f)
                verticalLineToRelative(dy = -3.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.28f, dx2 = 0.47f, dy2 = -2.26f, dx3 = 1.33f, dy3 = -2.76f)
                reflectiveCurveToRelative(dx1 = 1.95f, dy1 = -0.42f, dx2 = 3.06f, dy2 = 0.22f)
                lineToRelative(dx = 2.9f, dy = 1.67f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.64f, dx2 = 1.72f, dy2 = 1.54f, dx3 = 1.72f, dy3 = 2.54f)
                reflectiveCurveToRelative(dx1 = -0.61f, dy1 = 1.9f, dx2 = -1.72f, dy2 = 2.54f)
                lineToRelative(dx = -2.9f, dy = 1.67f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.56f, y1 = 17.0f)
                moveToRelative(dx = 0.0f, dy = -8.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.12f)
                curveToRelative(dx1 = -0.38f, dy1 = 0.22f, dx2 = -0.6f, dy2 = 0.75f, dx3 = -0.6f, dy3 = 1.47f)
                verticalLineToRelative(dy = 3.35f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.71f, dx2 = 0.22f, dy2 = 1.25f, dx3 = 0.6f, dy3 = 1.46f)
                curveToRelative(dx1 = 0.37f, dy1 = 0.22f, dx2 = 0.94f, dy2 = 0.13f, dx3 = 1.56f, dy3 = -0.22f)
                lineToRelative(dx = 2.9f, dy = -1.67f)
                curveToRelative(dx1 = 0.62f, dy1 = -0.36f, dx2 = 0.97f, dy2 = -0.8f, dx3 = 0.97f, dy3 = -1.24f)
                reflectiveCurveToRelative(dx1 = -0.36f, dy1 = -0.88f, dx2 = -0.97f, dy2 = -1.24f)
                lineToRelative(dx = -2.9f, dy = -1.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = -0.36f)
            }
        }.build().also { _playCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _playCircle: ImageVector? = null
