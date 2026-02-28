package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveBox: ImageVector
    get() {
        val current = _archiveBox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveBox",
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
                moveTo(x = 19.5f, y = 10.22f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.0f, dx2 = -0.5f, dy2 = 3.0f, dx3 = -3.0f, dy3 = 3.0f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.0f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineToRelative(dy = -8.78f)
                moveTo(x = 5.0f, y = 2.0f)
                horizontalLineToRelative(dx = 14.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineTo(x = 5.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -3.0f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                moveToRelative(dx = 5.18f, dy = 12.0f)
                horizontalLineToRelative(dx = 3.64f)
            }
        }.build().also { _archiveBox = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveBox: ImageVector? = null
