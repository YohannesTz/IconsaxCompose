package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextUnderline: ImageVector
    get() {
        val current = _textUnderline
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextUnderline",
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
                moveTo(x = 5.0f, y = 21.0f)
                horizontalLineToRelative(dx = 14.0f)
                moveToRelative(dx = -7.0f, dy = -4.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.0f, dy1 = -7.0f)
                verticalLineTo(y = 3.0f)
                moveTo(x = 5.0f, y = 3.0f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.17f, dx2 = 0.98f, dy2 = 4.1f, dx3 = 2.53f, dy3 = 5.38f)
            }
        }.build().also { _textUnderline = it }
    }

@Suppress("ObjectPropertyName")
private var _textUnderline: ImageVector? = null
