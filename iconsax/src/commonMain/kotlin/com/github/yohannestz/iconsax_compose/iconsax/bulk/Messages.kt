package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messages: ImageVector
    get() {
        val current = _messages
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Messages",
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
                moveTo(x = 17.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.87f, dx2 = -3.36f, dy2 = 7.0f, dx3 = -7.5f, dy3 = 7.0f)
                lineToRelative(dx = -0.93f, dy = 1.12f)
                lineToRelative(dx = -0.55f, dy = 0.66f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = -0.23f)
                lineTo(x = 5.0f, y = 14.6f)
                arcTo(horizontalEllipseRadius = 6.9f, verticalEllipseRadius = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.87f, dx2 = 3.36f, dy2 = -7.0f, dx3 = 7.5f, dy3 = -7.0f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.8f, dy1 = 4.07f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 9.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 12.86f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 5.6f)
                lineToRelative(dx = -1.34f, dy = 2.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = 0.23f)
                lineToRelative(dx = -1.48f, dy = -1.78f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.93f, dy1 = -2.74f)
                lineTo(x = 9.5f, y = 16.0f)
                curveToRelative(dx1 = 4.14f, dy1 = 0.0f, dx2 = 7.5f, dy2 = -3.13f, dx3 = 7.5f, dy3 = -7.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -2.93f)
                curveToRelative(dx1 = 3.27f, dy1 = 0.75f, dx2 = 5.7f, dy2 = 3.51f, dx3 = 5.7f, dy3 = 6.79f)
                moveTo(x = 12.0f, y = 9.75f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.59f, y1 = 9.75f, x2 = 6.25f, y2 = 9.41f, x3 = 6.25f, y3 = 9.0f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 8.25f, x2 = 7.0f, y2 = 8.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 12.41f, y1 = 9.75f, x2 = 12.0f, y2 = 9.75f)
            }
        }.build().also { _messages = it }
    }

@Suppress("ObjectPropertyName")
private var _messages: ImageVector? = null
