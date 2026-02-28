package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 22.0f, y = 12.86f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 5.6f)
                lineToRelative(dx = -1.34f, dy = 2.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = 0.23f)
                lineToRelative(dx = -1.48f, dy = -1.78f)
                arcToRelative(a = 7.7f, b = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.87f, dy1 = -1.68f)
                lineToRelative(dx = 0.6f, dy = -0.71f)
                curveToRelative(dx1 = 4.62f, dy1 = -0.35f, dx2 = 8.27f, dy2 = -4.01f, dx3 = 8.27f, dy3 = -8.47f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.31f, dy1 = -2.23f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.8f, dy1 = 6.09f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.3f, y = 6.07f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.5f, y1 = 2.0f)
                curveTo(x1 = 5.36f, y1 = 2.0f, x2 = 2.0f, y2 = 5.13f, x3 = 2.0f, y3 = 9.0f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 5.6f)
                lineToRelative(dx = 1.34f, dy = 2.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.68f, dy1 = 0.23f)
                lineToRelative(dx = 0.55f, dy = -0.66f)
                lineTo(x = 9.5f, y = 16.0f)
                curveToRelative(dx1 = 4.14f, dy1 = 0.0f, dx2 = 7.5f, dy2 = -3.13f, dx3 = 7.5f, dy3 = -7.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -2.93f)
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
