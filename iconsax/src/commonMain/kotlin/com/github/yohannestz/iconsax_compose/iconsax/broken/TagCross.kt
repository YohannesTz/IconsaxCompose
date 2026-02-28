package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagCross: ImageVector
    get() {
        val current = _tagCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagCross",
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
                moveTo(x = 12.92f, y = 3.75f)
                horizontalLineToRelative(dx = -2.64f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.7f, dy1 = 1.64f)
                lineTo(x = 3.05f, y = 9.27f)
                arcToRelative(a = 4.05f, b = 4.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.46f)
                lineToRelative(dx = 3.53f, dy = 3.88f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.7f, dy1 = 1.64f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -6.5f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = -5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 14.47f)
                lineToRelative(dx = -4.94f, dy = -4.94f)
                moveToRelative(dx = 4.15f, dy = 0.8f)
                lineTo(x = 16.0f, y = 9.52f)
                moveToRelative(dx = -4.94f, dy = 4.94f)
                lineToRelative(dx = 2.28f, dy = -2.29f)
            }
        }.build().also { _tagCross = it }
    }

@Suppress("ObjectPropertyName")
private var _tagCross: ImageVector? = null
