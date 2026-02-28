package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Game: ImageVector
    get() {
        val current = _game
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Game",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.13f, y = 15.0f)
                lineTo(x = 9.1f, y = 13.99f)
                lineToRelative(dx = 0.99f, dy = -1.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -0.99f, dy = 0.99f)
                lineToRelative(dx = -0.96f, dy = -0.96f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 0.96f, dy = 0.96f)
                lineToRelative(dx = -0.99f, dy = 0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 0.99f, dy = -1.0f)
                lineToRelative(dx = 1.03f, dy = 1.04f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                moveToRelative(dx = 3.41f, dy = 0.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.01f, dy2 = -0.45f, dx3 = -1.01f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 0.99f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.02f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = 3.94f, dy = 0.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.01f, dy2 = -0.45f, dx3 = -1.01f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 0.99f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.02f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = -1.98f, dy = 1.97f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -0.99f)
                verticalLineToRelative(dy = -0.02f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.01f)
                moveToRelative(dx = 0.0f, dy = -3.94f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -0.99f)
                verticalLineToRelative(dy = -0.02f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.01f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 11.07f)
                verticalLineToRelative(dy = 5.58f)
                curveTo(x1 = 22.0f, y1 = 19.6f, x2 = 19.6f, y2 = 22.0f, x3 = 16.65f, y3 = 22.0f)
                horizontalLineToRelative(dx = -9.3f)
                arcTo(horizontalEllipseRadius = 5.36f, verticalEllipseRadius = 5.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.65f)
                verticalLineToRelative(dy = -5.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.95f, dx2 = 2.4f, dy2 = -5.35f, dx3 = 5.35f, dy3 = -5.35f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 2.95f, dy1 = 0.0f, dx2 = 5.35f, dy2 = 2.4f, dx3 = 5.35f, dy3 = 5.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.64f, y = 2.71f)
                lineToRelative(dx = -0.01f, dy = 0.94f)
                arcTo(horizontalEllipseRadius = 1.64f, verticalEllipseRadius = 1.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.26f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.02f, dx2 = -0.24f, dy2 = 0.23f)
                curveToRelative(dx1 = -0.01f, dy1 = 0.21f, dx2 = 0.1f, dy2 = 0.23f, dx3 = 0.23f, dy3 = 0.23f)
                horizontalLineToRelative(dx = -1.61f)
                lineToRelative(dx = -0.02f, dy = -0.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.9f, dx2 = 0.73f, dy2 = -1.63f, dx3 = 1.62f, dy3 = -1.63f)
                quadToRelative(dx1 = 0.24f, dy1 = -0.02f, dx2 = 0.25f, dy2 = -0.23f)
                lineToRelative(dx = 0.01f, dy = -0.94f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.94f, y1 = 2.0f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.69f, dy1 = 0.71f)
            }
        }.build().also { _game = it }
    }

@Suppress("ObjectPropertyName")
private var _game: ImageVector? = null
