package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sun: ImageVector
    get() {
        val current = _sun
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sun",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 8.0f)
                verticalLineTo(y = 6.5f)
                moveTo(x = 12.0f, y = 4.0f)
                verticalLineTo(y = 3.0f)
                moveToRelative(dx = 0.0f, dy = 18.0f)
                verticalLineToRelative(dy = -5.5f)
                moveTo(x = 10.0f, y = 3.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -4.0f, dy = 18.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveTo(x = 8.97f, y = 10.25f)
                lineTo(x = 4.21f, y = 7.5f)
                moveToRelative(dx = 15.58f, dy = 9.0f)
                lineToRelative(dx = -4.76f, dy = -2.75f)
                moveTo(x = 3.21f, y = 9.23f)
                lineToRelative(dx = 2.0f, dy = -3.46f)
                moveToRelative(dx = 13.58f, dy = 12.46f)
                lineToRelative(dx = 2.0f, dy = -3.46f)
                moveTo(x = 8.97f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.5f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 8.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.8f, y = 7.5f)
                lineToRelative(dx = -2.75f, dy = 1.58f)
                lineToRelative(dx = -2.02f, dy = 1.17f)
                moveToRelative(dx = -6.06f, dy = 3.5f)
                lineTo(x = 4.21f, y = 16.5f)
                moveToRelative(dx = 16.58f, dy = -7.27f)
                lineToRelative(dx = -2.0f, dy = -3.46f)
                moveTo(x = 5.21f, y = 18.23f)
                lineToRelative(dx = -2.0f, dy = -3.46f)
            }
        }.build().also { _sun = it }
    }

@Suppress("ObjectPropertyName")
private var _sun: ImageVector? = null
