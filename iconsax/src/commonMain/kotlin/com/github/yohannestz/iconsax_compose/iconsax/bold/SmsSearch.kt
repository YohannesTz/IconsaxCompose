package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmsSearch: ImageVector
    get() {
        val current = _smsSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SmsSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 3.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.0f, y1 = 3.0f, x2 = 2.0f, y2 = 4.5f, x3 = 2.0f, y3 = 8.0f)
                verticalLineToRelative(dy = 7.96f)
                arcToRelative(a = 4.14f, b = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.14f, dy1 = 4.14f)
                horizontalLineToRelative(dx = 6.26f)
                curveToRelative(dx1 = 0.58f, dy1 = 0.0f, dx2 = 1.08f, dy2 = -0.49f, dx3 = 1.02f, dy3 = -1.07f)
                arcToRelative(a = 5.54f, b = 5.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.72f, dy1 = -5.72f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.53f, dy1 = 0.02f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 12.39f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveToRelative(dx = 0.47f, dy = 5.59f)
                lineToRelative(dx = -3.13f, dy = 2.5f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 11.88f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.34f, dy1 = -0.79f)
                lineToRelative(dx = -3.13f, dy = -2.5f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.12f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = -0.12f)
                lineToRelative(dx = 3.13f, dy = 2.5f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.81f, dy1 = 0.0f)
                lineToRelative(dx = 3.13f, dy = -2.5f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.12f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.11f, dy1 = 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.65f, y = 21.45f)
                lineTo(x = 21.9f, y = 20.7f)
                arcToRelative(a = 3.76f, b = 3.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.14f, dy1 = -5.82f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.06f, dy1 = 6.89f)
                lineToRelative(dx = 0.75f, dy = 0.75f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.54f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.0f, dx2 = 0.39f, dy2 = -0.07f, dx3 = 0.54f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.07f)
            }
        }.build().also { _smsSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _smsSearch: ImageVector? = null
