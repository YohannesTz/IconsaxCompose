package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messenger: ImageVector
    get() {
        val current = _messenger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Messenger",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 5.68f, y = 18.44f)
                verticalLineToRelative(dy = 1.85f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.49f, dy1 = 0.87f)
                lineToRelative(dx = 1.86f, dy = -1.05f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.96f, dy1 = 0.41f)
                curveToRelative(dx1 = 5.52f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.15f, dx3 = 10.0f, dy3 = -9.26f)
                reflectiveCurveTo(x1 = 17.51f, y1 = 2.0f, x2 = 11.99f, y2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -10.0f, dy1 = 4.15f, dx2 = -10.0f, dy2 = 9.26f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.69f, dy1 = 7.18f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.02f, y = 9.56f)
                lineToRelative(dx = -2.54f, dy = 3.02f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.8f)
                lineToRelative(dx = 2.01f, dy = -0.48f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = 0.05f)
                lineToRelative(dx = 1.01f, dy = 0.59f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.0f, y1 = 13.43f)
                lineToRelative(dx = 2.5f, dy = -3.0f)
                curveToRelative(dx1 = 0.31f, dy1 = -0.36f, dx2 = -0.04f, dy2 = -0.92f, dx3 = -0.51f, dy3 = -0.8f)
                lineToRelative(dx = -1.82f, dy = 0.48f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.36f, dy1 = -0.04f)
                lineToRelative(dx = -1.18f, dy = -0.62f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.61f, dy1 = 0.1f)
            }
        }.build().also { _messenger = it }
    }

@Suppress("ObjectPropertyName")
private var _messenger: ImageVector? = null
