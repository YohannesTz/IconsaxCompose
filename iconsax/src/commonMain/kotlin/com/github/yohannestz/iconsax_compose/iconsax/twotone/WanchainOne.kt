package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WanchainOne: ImageVector
    get() {
        val current = _wanchainOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WanchainOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.75f, y = 9.43f)
                lineTo(x = 8.5f, y = 15.0f)
                lineToRelative(dx = -0.63f, dy = 1.09f)
                lineToRelative(dx = -2.47f, dy = 4.22f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.02f)
                lineToRelative(dx = -3.38f, dy = -5.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.56f)
                lineToRelative(dx = 3.67f, dy = -5.5f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.27f, y1 = 9.0f)
                horizontalLineToRelative(dx = 6.23f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.5f, y = 15.0f)
                horizontalLineToRelative(dx = 5.63f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.43f, dy1 = -0.75f)
                lineToRelative(dx = -2.81f, dy = -4.82f)
                lineTo(x = 11.5f, y = 9.0f)
                lineTo(x = 8.44f, y = 3.75f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.87f, y1 = 3.0f)
                horizontalLineToRelative(dx = 6.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.25f)
                lineToRelative(dx = 6.7f, dy = 11.48f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 0.53f)
                lineToRelative(dx = -3.68f, dy = 5.52f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.73f, y1 = 21.0f)
                horizontalLineToRelative(dx = -6.46f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.42f, dy1 = -0.22f)
                lineToRelative(dx = -3.14f, dy = -4.71f)
                lineToRelative(dx = -0.44f, dy = -0.67f)
                close()
            }
        }.build().also { _wanchainOne = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchainOne: ImageVector? = null
