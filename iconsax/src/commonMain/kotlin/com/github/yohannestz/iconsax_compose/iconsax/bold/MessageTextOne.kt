package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageTextOne: ImageVector
    get() {
        val current = _messageTextOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageTextOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 2.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 4.98f)
                verticalLineToRelative(dy = 6.98f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 4.98f)
                horizontalLineToRelative(dx = 1.5f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.8f, dy1 = 0.4f)
                lineToRelative(dx = 1.5f, dy = 1.99f)
                curveToRelative(dx1 = 0.66f, dy1 = 0.88f, dx2 = 1.74f, dy2 = 0.88f, dx3 = 2.4f, dy3 = 0.0f)
                lineToRelative(dx = 1.5f, dy = -1.99f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.8f, dy1 = -0.4f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -4.98f)
                verticalLineTo(y = 6.98f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 2.0f)
                moveToRelative(dx = -4.0f, dy = 11.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 12.25f, x2 = 7.0f, y2 = 12.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 4.0f, dy = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.59f, y1 = 8.75f, x2 = 6.25f, y2 = 8.41f, x3 = 6.25f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 7.25f, x2 = 7.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 17.41f, y1 = 8.75f, x2 = 17.0f, y2 = 8.75f)
            }
        }.build().also { _messageTextOne = it }
    }

@Suppress("ObjectPropertyName")
private var _messageTextOne: ImageVector? = null
